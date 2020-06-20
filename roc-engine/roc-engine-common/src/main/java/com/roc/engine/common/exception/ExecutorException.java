package com.roc.engine.common.exception;

/**
 * @Description ExecutorException
 * @date  2020年6月13日下午2:44:08
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class ExecutorException extends RuntimeException {

    private static final long serialVersionUID = -2881774351225635644L;

    private String errCode;

    private String errMsg;

    public ExecutorException(String errCode, String errMsg) {
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
