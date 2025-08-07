package com.lark.project.service.attachment;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.attachment.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;

public class AttachmentServiceImpl implements AttachmentService{

    private static final Logger log = LoggerFactory.getLogger(AttachmentServiceImpl.class);

    private Config config;

    public AttachmentServiceImpl(Config config) {
        this.config = config;
    }

    // 添加附件
    public UploadAttachmentResp uploadAttachment(UploadAttachmentReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setSupportUpload(true);

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/file/upload"
                , false
                , req);

        UploadAttachmentResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UploadAttachmentResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/file/upload"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 下载附件
    public DownloadAttachmentResp downloadAttachment(DownloadAttachmentReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setSupportDownLoad(true);

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/file/download"
                , false
                , req);

        if (httpResponse.getStatusCode() == 200) {
            DownloadAttachmentResp resp = new DownloadAttachmentResp();
            resp.setRawResponse(httpResponse);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            outputStream.write(httpResponse.getBody());
            resp.setData(outputStream);
            resp.setFileName(httpResponse.getFileName());
            return resp;
        }

        DownloadAttachmentResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DownloadAttachmentResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/file/download"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 附件上传
    public SpecialUploadAttachmentResp specialUploadAttachment(SpecialUploadAttachmentReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setSupportUpload(true);

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/file/upload"
                , false
                , req);

        SpecialUploadAttachmentResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SpecialUploadAttachmentResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/file/upload"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    @Override
    public DeleteAttachmentResp deleteAttachment(DeleteAttachmentReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/file/delete"
                , false
                , req);

        DeleteAttachmentResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteAttachmentResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/file/delete"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
