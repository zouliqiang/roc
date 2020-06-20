package com.roc.engine.common.code;
/**
 * @Description 元数据模块错误码
 * @date  2020年6月13日下午3:01:05
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public enum MetaErrorCode {
    
    ROC_ENGINE_META_ERROR_100001("100001","元数据初始化参数错误"),
    
    ROC_ENGINE_META_ERROR_100002("100002","元数据刪除region参数错误");

    
    private String code;

    private String msg;

    private MetaErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
