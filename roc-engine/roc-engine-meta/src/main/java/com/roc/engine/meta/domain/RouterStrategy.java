package com.roc.engine.meta.domain;

import java.util.Map;

/**
 * @Description 路由策略
 * @date  2020年6月13日下午12:57:36
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class RouterStrategy implements java.io.Serializable {

    private static final long serialVersionUID = 2688194938495525770L;
    
    /**
     * 物理表
     */
    private PhysicsTable physicsTable;
    
    /**
     * 路由策略
     */
    private Map<String, Object> prop;

    public PhysicsTable getPhysicsTable() {
        return physicsTable;
    }

    public void setPhysicsTable(PhysicsTable physicsTable) {
        this.physicsTable = physicsTable;
    }

    public Map<String, Object> getProp() {
        return prop;
    }

    public void setProp(Map<String, Object> prop) {
        this.prop = prop;
    }

}
