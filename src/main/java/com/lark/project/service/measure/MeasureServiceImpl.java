/*
 * Copyright (c) 2023 Lark Technologies Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lark.project.service.measure;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.measure.builder.QueryChartDataReq;
import com.lark.project.service.measure.builder.QueryChartDataResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeasureServiceImpl implements MeasureService {

    private static final Logger log = LoggerFactory.getLogger(MeasureServiceImpl.class);

    private Config config;

    public MeasureServiceImpl(Config config) {
        this.config = config;
    }

    // 度量查询接口
    public QueryChartDataResp queryChartData(QueryChartDataReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/measure/:chart_id"
                , false
                , req);

        QueryChartDataResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryChartDataResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/measure/:chart_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}