package com.roc.engine.meta.domain;

import java.util.List;

/**
 * @Description 域 等同于数据库
 * @date  2020年6月13日下午12:39:36
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class Region implements java.io.Serializable{
  
    private static final long serialVersionUID = -895738019647487717L;
    
    /**
     * 域名
     */
    private String name;
    /**
     * 表集合
     */
    private List<Table> tables;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
    
  }
