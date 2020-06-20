package com.roc.engine.meta.domain;

import java.util.List;

/**
 * @Description 逻辑表
 * @date  2020年6月13日下午12:33:23
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class Table implements java.io.Serializable {

    private static final long serialVersionUID = 1084177633370864839L;

    /**
     * 域
     */
    private String regineName;

    /**
     * 表名称
     */
    private String name;

    /**
     * 属性
     */
    private List<Field> fieldList;

    /**
     * 路由
     */
    private Router router;

    public String getRegineName() {
        return regineName;
    }

    public void setRegineName(String regineName) {
        this.regineName = regineName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }
}
