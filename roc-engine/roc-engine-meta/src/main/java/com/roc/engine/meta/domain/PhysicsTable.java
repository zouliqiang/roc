package com.roc.engine.meta.domain;

/**
 * @Description 物理表
 * @date  2020年6月13日下午12:37:47
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class PhysicsTable implements java.io.Serializable {
  
    private static final long serialVersionUID = 2850785172963064597L;
    /**
     * 物理表名
     */
    private String name;
    /**
     * 绑定数据源
     */
    private DataSourceCategory dataSourceCategory;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public DataSourceCategory getDataSourceCategory() {
        return dataSourceCategory;
    }
    public void setDataSourceCategory(DataSourceCategory dataSourceCategory) {
        this.dataSourceCategory = dataSourceCategory;
    }
    
    
}
