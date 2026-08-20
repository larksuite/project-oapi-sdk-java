package com.lark.project.service.file;

import com.lark.project.core.Config;
import com.lark.project.core.Constants;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.token.GlobalTokenManager;
import com.lark.project.core.utils.FileNameParser;
import com.lark.project.core.utils.Jsons;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.file.builder.*;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.lark.project.core.response.BaseResponse;

public class FileServiceImpl implements FileService {

    private static final Logger log = LoggerFactory.getLogger(FileServiceImpl.class);
    private static final CloseableHttpClient HTTP_CLIENT = HttpClients.createDefault();

    private Config config;

    public FileServiceImpl(Config config) {
        this.config = config;
    }

    private static class FileErrorResp {
        private int code;
        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    private <T extends BaseResponse> T unmarshalFileResp(RawResponse rawResponse, Class<T> respClass) {
        T resp = UnmarshalRespUtil.unmarshalResp(rawResponse, respClass);
        if (resp != null) {
            try {
                String body = new String(rawResponse.getBody(), StandardCharsets.UTF_8);
                FileErrorResp fileError = Jsons.DEFAULT.fromJson(body, FileErrorResp.class);
                if (fileError != null) {
                    resp.setErrCode(fileError.getCode());
                    resp.setErrMsg(fileError.getMessage());
                }
            } catch (Exception e) {
                // ignore
            }
        }
        return resp;
    }

    private void addAuthHeaders(org.apache.http.client.methods.HttpRequestBase request, RequestOptions reqOptions) throws Exception {
        request.setHeader("User-Agent", "oapi-sdk-java/" + Constants.VERSION);
        if (reqOptions != null && reqOptions.getHeaders() != null) {
            for (Map.Entry<String, List<String>> entry : reqOptions.getHeaders().entrySet()) {
                for (String value : entry.getValue()) {
                    request.setHeader(entry.getKey(), value);
                }
            }
        }
        if (request.getFirstHeader(Constants.HTTP_HEADER_ACCESS_TOKEN) == null) {
            if (!config.isDisableTokenCache()) {
                String token = GlobalTokenManager.getTokenManager().getAccessTokenThenCache(config);
                request.setHeader("X-PLUGIN-TOKEN", token);
            }
        }
    }

    @Override
    public UploadFileResp uploadFileByForm(UploadFileReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setSupportUpload(true);

        String url = config.getBaseUrl() + "/open_api/" + req.getProjectKey() + "/file/stream/resource/" + req.getResourceType() + "/upload_form";
        HttpPost post = new HttpPost(url);
        addAuthHeaders(post, reqOptions);

        UploadFileReqBody body = req.getUploadFileReqBody();
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.RFC6532);
        
        if (body.getFieldMap() != null) {
            String fieldMapStr = body.getFieldMap() instanceof String ? (String) body.getFieldMap() : Jsons.DEFAULT.toJson(body.getFieldMap());
            builder.addTextBody("field_map", fieldMapStr, ContentType.TEXT_PLAIN.withCharset(StandardCharsets.UTF_8));
        }
        
        String fileName = body.getFileName();
        if (fileName == null || fileName.isEmpty()) {
            fileName = "unknown-file";
        }
        ContentType contentType = ContentType.APPLICATION_OCTET_STREAM;
        if (body.getMimeType() != null && !body.getMimeType().isEmpty()) {
            contentType = ContentType.create(body.getMimeType());
        }
        builder.addBinaryBody("file", body.getFile(), contentType, fileName);

        post.setEntity(builder.build());

        try (CloseableHttpResponse response = HTTP_CLIENT.execute(post)) {
            RawResponse rawResponse = new RawResponse();
            rawResponse.setStatusCode(response.getStatusLine().getStatusCode());
            
            Map<String, List<String>> respHeaders = new HashMap<>();
            for (Header header : response.getAllHeaders()) {
                respHeaders.computeIfAbsent(header.getName(), k -> new ArrayList<>()).add(header.getValue());
            }
            rawResponse.setHeaders(respHeaders);
            
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                rawResponse.setBody(EntityUtils.toByteArray(entity));
            }
            
            UploadFileResp resp = unmarshalFileResp(rawResponse, UploadFileResp.class);
            if (resp == null) {
                log.error(Logs.formatReq(req, rawResponse, "/open_api/:project_key/file/stream/resource/:resource_type/upload_form"));
                throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
            }
            resp.setRawResponse(rawResponse);
            resp.setRequest(req);
            return resp;
        }
    }

    @Override
    public DownloadFileResp downloadFile(DownloadFileReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        reqOptions.setSupportDownLoad(true);

        String url = config.getBaseUrl() + "/open_api/" + req.getProjectKey() + "/file/stream/download/" + req.getFileToken();
        HttpGet get = new HttpGet(url);
        addAuthHeaders(get, reqOptions);

        CloseableHttpResponse response = HTTP_CLIENT.execute(get);
        
        if (response.getStatusLine().getStatusCode() == 200) {
            DownloadFileResp resp = new DownloadFileResp();
            
            RawResponse rawResponse = new RawResponse();
            rawResponse.setStatusCode(200);
            Map<String, List<String>> respHeaders = new HashMap<>();
            for (Header header : response.getAllHeaders()) {
                respHeaders.computeIfAbsent(header.getName(), k -> new ArrayList<>()).add(header.getValue());
            }
            rawResponse.setHeaders(respHeaders);
            resp.setRawResponse(rawResponse);
            
            String contentDisposition = rawResponse.getHeaders().containsKey(Constants.CONTENT_DISPOSITION) ? rawResponse.getHeaders().get(Constants.CONTENT_DISPOSITION).get(0) : "";
            resp.setFileName(FileNameParser.parseFileName(contentDisposition));
            String contentType = rawResponse.getHeaders().containsKey(Constants.CONTENT_TYPE) ? rawResponse.getHeaders().get(Constants.CONTENT_TYPE).get(0) : "";
            resp.setMimeType(contentType);
            
            InputStream originalStream = response.getEntity().getContent();
            resp.setData(new FilterInputStream(originalStream) {
                @Override
                public void close() throws IOException {
                    try {
                        super.close();
                    } finally {
                        response.close();
                    }
                }
            });
            return resp;
        } else {
            try {
                RawResponse rawResponse = new RawResponse();
                rawResponse.setStatusCode(response.getStatusLine().getStatusCode());
                Map<String, List<String>> respHeaders = new HashMap<>();
                for (Header header : response.getAllHeaders()) {
                    respHeaders.computeIfAbsent(header.getName(), k -> new ArrayList<>()).add(header.getValue());
                }
                rawResponse.setHeaders(respHeaders);
                
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    rawResponse.setBody(EntityUtils.toByteArray(entity));
                }
                
                DownloadFileResp resp = unmarshalFileResp(rawResponse, DownloadFileResp.class);
                if (resp == null) {
                    log.error(Logs.formatReq(req, rawResponse, "/open_api/:project_key/file/stream/download/:file_token"));
                    throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
                }
                resp.setRawResponse(rawResponse);
                resp.setRequest(req);
                return resp;
            } finally {
                response.close();
            }
        }
    }

    @Override
    public UploadPreProcessResp uploadPreProcess(UploadPreProcessReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/file/resource/:resource_type/upload/preprocess"
                , false
                , req);

        UploadPreProcessResp resp = unmarshalFileResp(httpResponse, UploadPreProcessResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/file/resource/:resource_type/upload/preprocess"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);
        return resp;
    }

    @Override
    public UploadPartResp uploadPart(UploadPartReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        String url = config.getBaseUrl() + "/open_api/" + req.getProjectKey() + "/file/stream/upload/multipart/" + req.getResourceId() + "/" + req.getPartNumber();
        if (req.getMd5() != null && !req.getMd5().isEmpty()) {
            url += "?md5=" + java.net.URLEncoder.encode(req.getMd5(), "UTF-8");
        }

        HttpPost post = new HttpPost(url);
        addAuthHeaders(post, reqOptions);

        InputStream file = req.getFile();
        if (file != null) {
            long size = req.getFileSize() != null ? req.getFileSize() : -1;
            post.setEntity(new org.apache.http.entity.InputStreamEntity(file, size, ContentType.APPLICATION_OCTET_STREAM));
        }

        try (CloseableHttpResponse response = HTTP_CLIENT.execute(post)) {
            RawResponse rawResponse = new RawResponse();
            rawResponse.setStatusCode(response.getStatusLine().getStatusCode());

            Map<String, List<String>> respHeaders = new HashMap<>();
            for (Header header : response.getAllHeaders()) {
                respHeaders.computeIfAbsent(header.getName(), k -> new ArrayList<>()).add(header.getValue());
            }
            rawResponse.setHeaders(respHeaders);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                rawResponse.setBody(EntityUtils.toByteArray(entity));
            }

            UploadPartResp resp = unmarshalFileResp(rawResponse, UploadPartResp.class);
            if (resp == null) {
                log.error(Logs.formatReq(req, rawResponse, "/open_api/:project_key/file/stream/upload/multipart/:resource_id/:part_number"));
                throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
            }

            resp.setRawResponse(rawResponse);
            resp.setRequest(req);
            return resp;
        }
    }

    @Override
    public UploadPartFinishResp uploadPartFinish(UploadPartFinishReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/file/upload/multipart/finish/:resource_id"
                , false
                , req);

        UploadPartFinishResp resp = unmarshalFileResp(httpResponse, UploadPartFinishResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/file/upload/multipart/finish/:resource_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);
        return resp;
    }

    @Override
    public UploadPartAbortResp uploadPartAbort(UploadPartAbortReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/file/upload/multipart/abort/:resource_id"
                , false
                , req);

        UploadPartAbortResp resp = unmarshalFileResp(httpResponse, UploadPartAbortResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/file/upload/multipart/abort/:resource_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);
        return resp;
    }

    @Override
    public UploadPartFinishResp multipartUpload(MultipartUploadReq req, RequestOptions reqOptions) throws Exception {
        java.io.File uploadFile = req.getFile();
        long fileSize = req.getFileSize();
        String fileName = req.getFileName();
        long maxDirectUploadSize = 100 * 1024 * 1024L; // 100MB

        String mimeType = req.getMimeType();
        if (mimeType == null || mimeType.isEmpty()) {
            mimeType = URLConnection.guessContentTypeFromName(fileName);
            if (mimeType == null) {
                mimeType = "application/octet-stream";
            }
        }

        if (fileSize <= maxDirectUploadSize) {
            return doFormUploadFallback(req, reqOptions, uploadFile, fileSize, fileName, mimeType);
        }

        // 大文件分片上传 - 预处理
        UploadPreProcessResp preProcessResp = doPreProcess(req, reqOptions, fileSize, fileName, mimeType);
        String resourceId = preProcessResp.getData().getResourceId();
        
        Long partSize = 20 * 1024 * 1024L; // 20MB fallback
        long partCount = 0L;
        List<Integer> needParts = null;
        if (preProcessResp.getData().getMultipart() != null) {
            if (preProcessResp.getData().getMultipart().getPartSize() != null && preProcessResp.getData().getMultipart().getPartSize() > 0) {
                partSize = preProcessResp.getData().getMultipart().getPartSize();
            }
            if (preProcessResp.getData().getMultipart().getPartCount() != null) {
                partCount = preProcessResp.getData().getMultipart().getPartCount().longValue();
            }
            needParts = preProcessResp.getData().getMultipart().getNeed();
        }

        try {
            if (needParts != null && !needParts.isEmpty()) {
                uploadPartsConcurrent(req, reqOptions, uploadFile, fileSize, resourceId, partSize, partCount, needParts);
            }
        } catch (Exception e) {
            abortMultipart(req.getProjectKey(), resourceId, reqOptions);
            throw e;
        }

        UploadPartFinishReq finishReq = UploadPartFinishReq.newBuilder()
                .projectKey(req.getProjectKey())
                .resourceId(resourceId)
                .build();
        UploadPartFinishResp finishResp = uploadPartFinish(finishReq, reqOptions);
        if (!finishResp.success()) {
            abortMultipart(req.getProjectKey(), resourceId, reqOptions);
            throw new Exception(String.format("[MultipartUpload] finish error:[code=%s, msg=%s]", finishResp.getErrCode(), finishResp.getErrMsg()));
        }

        return finishResp;
    }

    private UploadPartFinishResp doFormUploadFallback(MultipartUploadReq req, RequestOptions reqOptions, java.io.File uploadFile, long fileSize, String fileName, String mimeType) throws Exception {
        try (java.io.FileInputStream fis = new java.io.FileInputStream(uploadFile)) {
            UploadFileReq uploadFileReq = UploadFileReq.newBuilder()
                    .projectKey(req.getProjectKey())
                    .resourceType(req.getResourceType())
                    .file(fis)
                    .fileName(fileName)
                    .fileSize(fileSize)
                    .fieldMap(req.getFieldMap())
                    .mimeType(mimeType)
                    .build();
            UploadFileResp formResp = uploadFileByForm(uploadFileReq, reqOptions);
            if (!formResp.success()) {
                throw new Exception(String.format("[MultipartUpload] upload by form error:[code=%s, msg=%s]", formResp.getErrCode(), formResp.getErrMsg()));
            }
            UploadPartFinishResp finishResp = new UploadPartFinishResp();
            finishResp.setRawResponse(formResp.getRawResponse());
            finishResp.setErrCode(formResp.getErrCode());
            finishResp.setErrMsg(formResp.getErrMsg());
            if (formResp.getData() != null) {
                com.lark.project.service.file.model.UploadPartFinishResult data = new com.lark.project.service.file.model.UploadPartFinishResult();
                data.setFileToken(formResp.getData().getFileToken());
                finishResp.setData(data);
            }
            return finishResp;
        }
    }

    private UploadPreProcessResp doPreProcess(MultipartUploadReq req, RequestOptions reqOptions, long fileSize, String fileName, String mimeType) throws Exception {
        UploadPreProcessReq.Builder preProcessReqBuilder = UploadPreProcessReq.newBuilder()
                .projectKey(req.getProjectKey())
                .resourceType(req.getResourceType())
                .size(fileSize)
                .fileName(fileName)
                .fieldMap(req.getFieldMap())
                .mimeType(mimeType);

        if (req.getResourceId() != null && !req.getResourceId().isEmpty()) {
            preProcessReqBuilder.resourceId(req.getResourceId());
        }

        UploadPreProcessReq preProcessReq = preProcessReqBuilder.build();
        UploadPreProcessResp preProcessResp = uploadPreProcess(preProcessReq, reqOptions);
        if (!preProcessResp.success()) {
            throw new Exception(String.format("[MultipartUpload] preprocess error:[code=%s, msg=%s]", preProcessResp.getErrCode(), preProcessResp.getErrMsg()));
        }

        if (preProcessResp.getData() == null) {
            throw new Exception("[MultipartUpload] empty preprocess data");
        }
        return preProcessResp;
    }

    private void uploadPartsConcurrent(MultipartUploadReq req, RequestOptions reqOptions, java.io.File uploadFile, long fileSize, String resourceId, long partSize, long partCount, List<Integer> needParts) throws Exception {
        int concurrency = req.getConcurrency();
        if (concurrency <= 0) {
            concurrency = 5;
        }
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(concurrency);
        List<java.util.concurrent.Future<Void>> futures = new ArrayList<>();
        java.util.concurrent.atomic.AtomicReference<Exception> uploadException = new java.util.concurrent.atomic.AtomicReference<>();

        for (Integer partNumber : needParts) {
            final int currentPartNumber = partNumber;
            final RequestOptions finalReqOptions = reqOptions;
            
            futures.add(executor.submit(() -> {
                if (uploadException.get() != null) {
                    return null;
                }
                
                long tempStart = currentPartNumber * partSize;
                if (tempStart > fileSize) {
                    tempStart = fileSize;
                }
                long end;
                if (currentPartNumber == partCount - 1) {
                    end = fileSize;
                } else {
                    end = tempStart + partSize;
                    if (end > fileSize) {
                        end = fileSize;
                    }
                }
                final long start = tempStart;
                final long length = end - tempStart;
                
                try {
                    String md5Hex = calculateFilePartMd5(uploadFile, start, length);
                    
                    try (InputStream partStream = new java.io.FileInputStream(uploadFile) {
                        private long remaining = length;
                        { skip(start); }
                        
                        @Override
                        public int read() throws IOException {
                            if (remaining <= 0) return -1;
                            int res = super.read();
                            if (res != -1) remaining--;
                            return res;
                        }
                        
                        @Override
                        public int read(byte[] b, int off, int len) throws IOException {
                            if (remaining <= 0) return -1;
                            int res = super.read(b, off, (int)Math.min(len, remaining));
                            if (res != -1) remaining -= res;
                            return res;
                        }
                    }) {
                        UploadPartReq partReq = UploadPartReq.newBuilder()
                                .projectKey(req.getProjectKey())
                                .resourceId(resourceId)
                                .partNumber(currentPartNumber)
                                .md5(md5Hex)
                                .fileSize(length)
                                .file(partStream)
                                .build();

                        UploadPartResp partResp = uploadPart(partReq, finalReqOptions);
                        if (!partResp.success()) {
                            throw new Exception(String.format("[MultipartUpload] upload part %d error:[code=%s, msg=%s]", currentPartNumber, partResp.getErrCode(), partResp.getErrMsg()));
                        }
                    }
                } catch (Exception e) {
                    uploadException.compareAndSet(null, e);
                }
                return null;
            }));
        }

        executor.shutdown();
        for (java.util.concurrent.Future<Void> future : futures) {
            future.get();
        }

        if (uploadException.get() != null) {
            throw uploadException.get();
        }
    }

    private String calculateFilePartMd5(java.io.File file, long start, long length) throws Exception {
        try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(file, "r")) {
            raf.seek(start);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] buf = new byte[8192];
            long remaining = length;
            while (remaining > 0) {
                int read = raf.read(buf, 0, (int) Math.min(buf.length, remaining));
                if (read == -1) break;
                md.update(buf, 0, read);
                remaining -= read;
            }
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }
    }

    private void abortMultipart(String projectKey, String resourceId, RequestOptions reqOptions) {
        UploadPartAbortReq abortReq = UploadPartAbortReq.newBuilder()
                .projectKey(projectKey)
                .resourceId(resourceId)
                .build();
        try {
            UploadPartAbortResp resp = uploadPartAbort(abortReq, reqOptions);
            if (!resp.success()) {
                log.error(String.format("[MultipartUpload] fail to abort upload, resource_id: %s, error:[code=%s, msg=%s]", resourceId, resp.getErrCode(), resp.getErrMsg()));
            }
        } catch (Exception abortE) {
            log.error(String.format("[MultipartUpload] fail to abort upload, resource_id: %s, error: %s", resourceId, abortE.getMessage()));
        }
    }

}
