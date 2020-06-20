package com.roc.engine.common.exception;

/**
 * @Description SourceException
 * @date  2020年6月13日下午2:45:51
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class SourceException extends RuntimeException {

    private static final long serialVersionUID = -7045009123183772033L;

    private String errCode;

    private String errMsg;

    public SourceException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
