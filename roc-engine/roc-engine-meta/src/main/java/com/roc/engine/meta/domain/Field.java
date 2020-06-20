package com.roc.engine.meta.domain;

/**
 * @Description 属性字段
 * @date  2020年6月13日下午12:37:25
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class Field implements java.io.Serializable {

    private static final long serialVersionUID = 1793452092316676830L;
    
    /**
     * 属性名称
     */
    private String name;
    /**
     * 数据类型
     */
    private DataType dataType;
    /**
     * 是否主键
     */
    private Boolean isPrimaryKey;
    /**
     * 是否是routeKey
     */
    private Boolean isRouterKey;
    /**
     * 是否是查询索引
     */
    private Boolean isIndexKey;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public DataType getDataType() {
        return dataType;
    }
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }
    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }
    public Boolean getIsRouterKey() {
        return isRouterKey;
    }
    public void setIsRouterKey(Boolean isRouterKey) {
        this.isRouterKey = isRouterKey;
    }
    public Boolean getIsIndexKey() {
        return isIndexKey;
    }
    public void setIsIndexKey(Boolean isIndexKey) {
        this.isIndexKey = isIndexKey;
    }
    
}
