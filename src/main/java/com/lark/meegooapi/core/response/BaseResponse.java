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

package com.lark.meegooapi.core.response;


import com.google.gson.annotations.SerializedName;

public class BaseResponse {

    private RawResponse rawResponse;
    private Object request;

    @SerializedName("err")
    private Err err;
    @SerializedName("err_code")
    private int errCode;
    @SerializedName("err_msg")
    private String errMsg;


    public BaseResponse() {
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }


    public Err getErr() {
        return err;
    }

    public void setErr(Err err) {
        this.err = err;
    }

    public RawResponse getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(RawResponse rawResponse) {
        this.rawResponse = rawResponse;
    }

    public String getRequestId() {
        if (rawResponse != null) {
            return rawResponse.getRequestID();
        }
        return "";
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public boolean success() {
        return errCode == 0;
    }

}
