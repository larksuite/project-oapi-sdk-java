package com.lark.project.service.attachment;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.attachment.builder.*;

public interface AttachmentService {

    // 添加附件
    public UploadAttachmentResp uploadAttachment(UploadAttachmentReq req, RequestOptions reqOptions) throws Exception;

    // 下载附件
    public DownloadAttachmentResp downloadAttachment(DownloadAttachmentReq req, RequestOptions reqOptions) throws Exception;

    // 附件上传
    public SpecialUploadAttachmentResp specialUploadAttachment(SpecialUploadAttachmentReq req, RequestOptions reqOptions) throws Exception;

    // 附件删除
    public DeleteAttachmentResp deleteAttachment(DeleteAttachmentReq req, RequestOptions reqOptions) throws Exception;

}
