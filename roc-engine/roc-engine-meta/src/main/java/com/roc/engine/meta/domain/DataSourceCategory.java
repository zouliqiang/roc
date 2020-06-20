package com.roc.engine.meta.domain;

/**
 * @Description 数据源类型
 * @date  2020年6月13日下午12:36:09
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public enum DataSourceCategory {
    HBASE(QueryCategory.SCAN), 
    REDIS_KV(QueryCategory.KV),
    REDIS_HASH(QueryCategory.KKV),
    REDIS_ZSET(QueryCategory.SCAN), 
    MYSQL(QueryCategory.SQL), 
    ELASTICSEARCH(QueryCategory.SCAN), 
    KYLIN(QueryCategory.SQL), 
    CUSTOMER(QueryCategory.SCAN);
    private final QueryCategory queryCategory;

    private DataSourceCategory(QueryCategory queryCategory) {
        this.queryCategory = queryCategory;
    }

    public QueryCategory getQueryCategory() {
        return queryCategory;
    }
}
