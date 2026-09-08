package com.lark.project.service.file;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.file.builder.*;

public interface FileService {
    UploadFileResp uploadFileByForm(UploadFileReq req, RequestOptions reqOptions) throws Exception;

    DownloadFileResp downloadFile(DownloadFileReq req, RequestOptions reqOptions) throws Exception;

    UploadPreProcessResp uploadPreProcess(UploadPreProcessReq req, RequestOptions reqOptions) throws Exception;

    UploadPartResp uploadPart(UploadPartReq req, RequestOptions reqOptions) throws Exception;

    UploadPartFinishResp uploadPartFinish(UploadPartFinishReq req, RequestOptions reqOptions) throws Exception;

    UploadPartAbortResp uploadPartAbort(UploadPartAbortReq req, RequestOptions reqOptions) throws Exception;

    UploadPartFinishResp multipartUpload(MultipartUploadReq req, RequestOptions reqOptions) throws Exception;
}
