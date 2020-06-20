package com.roc.engine.common.exception;

/**
 * @Description ParserException
 * @date  2020年6月13日下午2:42:45
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class ParserException extends RuntimeException {

    private static final long serialVersionUID = 5889079560942037456L;

    private String errCode;

    private String errMsg;

    public ParserException(String errCode, String errMsg) {
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
