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

package com.lark.meegooapi.core;

import com.lark.meegooapi.core.exception.ClientTimeoutException;
import com.lark.meegooapi.core.exception.ServerTimeoutException;
import com.lark.meegooapi.core.httpclient.IHttpTransport;
import com.lark.meegooapi.core.httpclient.OkHttpTransport;
import com.lark.meegooapi.core.request.BaseRequest;
import com.lark.meegooapi.core.request.RawRequest;
import com.lark.meegooapi.core.request.ReqTranslator;
import com.lark.meegooapi.core.request.RequestOptions;
import com.lark.meegooapi.core.response.RawResponse;
import com.lark.meegooapi.core.utils.Jsons;
import com.lark.meegooapi.core.utils.OKHttps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;

public class Transport {

    private static final Logger log = LoggerFactory.getLogger(Transport.class);
    private static final ReqTranslator REQ_TRANSLATOR = new ReqTranslator();

    public static RawResponse send(Config config
            , RequestOptions requestOptions
            , String methodType
            , String path
            , boolean skipAuth
            , BaseRequest req) throws Exception {
        try {
            // 避免NPE
            if (requestOptions == null) {
                requestOptions = new RequestOptions();
            }
            if (requestOptions.getHeaders() == null) {
                requestOptions.setHeaders(req.getHeaders());
            } else if (req.getHeaders() != null) {
                requestOptions.getHeaders().putAll(req.getHeaders());
            }
            // 具体处理
            return doSend(config, methodType, path, req, skipAuth, requestOptions);
        } catch (InterruptedIOException e) {
            log.error("send error:{},{}", methodType, path, e);
            if ("timeout".equals(e.getMessage())) {
                throw new ClientTimeoutException();
            }
            throw e;

        } catch (Throwable e) {
            throw e;
        }
    }

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

    private static RawResponse doSend(Config config, String httpMethod, String httpPath,
                                      Object req, boolean skipAuth, RequestOptions requestOptions) throws Exception {
        Exception error = null;
        for (int i = 0; i < 2; i++) {
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
                error = e;
                if (!skipAuth) {
                    throw e;
                }
            }
        }
        throw error;
    }
}
