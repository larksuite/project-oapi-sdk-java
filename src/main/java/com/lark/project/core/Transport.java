/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.project.core;

import com.lark.project.core.exception.ClientTimeoutException;
import com.lark.project.core.exception.ServerTimeoutException;
import com.lark.project.core.httpclient.IHttpTransport;
import com.lark.project.core.httpclient.OkHttpTransport;
import com.lark.project.core.request.BaseRequest;
import com.lark.project.core.request.RawRequest;
import com.lark.project.core.request.ReqTranslator;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Jsons;
import com.lark.project.core.utils.OKHttps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;

public class Transport {

    private static final Logger log = LoggerFactory.getLogger(Transport.class);
    private static final ReqTranslator REQ_TRANSLATOR = new ReqTranslator();

    private static void logReq(RawRequest req, String httpPath, boolean isUpload) {
        try {
            if (null == req) {
                return;
            }

            if (!isUpload) {
                log.debug("req,path:{},header:{},body:{}", httpPath
                        , Jsons.DEFAULT.toJson(req.getHeaders())
                        , req.getBody() == null ? "" : Jsons.DEFAULT.toJson(req.getBody()));
            } else {
                log.debug("req,path:{},header:{}", httpPath, req.getHeaders());
            }
        } catch (Throwable e) {
            log.error("logReq error:{}", e);
        }
    }

    public static RawResponse doSend(Config config, RequestOptions requestOptions, String httpMethod, String httpPath, boolean skipAuth,
                                      Object req) throws Exception {
            try {
                // 参数转换
                RawRequest request = REQ_TRANSLATOR.translate(req, config, httpMethod,
                        httpPath, skipAuth, requestOptions);

                // 打印日志
                if (config.isLogReqAtDebug()) {
                    logReq(request, httpPath, requestOptions.isSupportUpload());
                }

                // 执行调用
                IHttpTransport httpTransport = config.getHttpTransport();
                if (httpTransport == null) {
                    httpTransport = new OkHttpTransport(OKHttps.defaultClient);
                }
                RawResponse rawResponse = httpTransport.execute(request);

                // 打印日志
                if (config.isLogReqAtDebug() || !skipAuth) {
                    if (requestOptions.isSupportDownLoad()) {
                        log.debug("resp,path:{},code:{},header:{}", httpPath, rawResponse.getStatusCode(),
                                rawResponse.getHeaders());
                    } else {
                        log.debug("resp,path:{},code:{},header:{},body:{}", httpPath,
                                rawResponse.getStatusCode(), rawResponse.getHeaders(),
                                new String(rawResponse.getBody(), StandardCharsets.UTF_8));
                    }
                }

                // 服务端超时
                if (rawResponse.getStatusCode() == 504) {
                    log.error(String.format("httpMethod:%s,httpPath:%s, server time out,reqId:%s", httpMethod,
                            httpPath, rawResponse.getRequestID()));
                    throw new ServerTimeoutException();
                }
                return rawResponse;
            } catch (Exception e) {
                    throw e;
            }
    }
}
