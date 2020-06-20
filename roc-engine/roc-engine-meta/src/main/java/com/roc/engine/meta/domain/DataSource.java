package com.roc.engine.meta.domain;

import java.util.Map;

/**
 * @Description 数据源
 * @date  2020年6月13日下午12:35:42
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class DataSource implements java.io.Serializable {

    private static final long serialVersionUID = -3332571399666265477L;

    /**
     * 数据源名称
     */
    private String name;

    /**
     * 数据源类型
     */
    private DataSourceType dataSourceType;

    /**
     * 数据源配置
     */
    private Map<String, Object> props;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataSourceType getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(DataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public Map<String, Object> getProps() {
        return props;
    }

    public void setProps(Map<String, Object> props) {
        this.props = props;
    }

}
