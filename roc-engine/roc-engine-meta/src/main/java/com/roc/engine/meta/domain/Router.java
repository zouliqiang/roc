package com.roc.engine.meta.domain;

import java.util.List;

/**
 * @Description 路由
 * @date  2020年6月13日下午12:40:36
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class Router implements java.io.Serializable {

    private static final long serialVersionUID = 7032370830951827118L;

    /**
     * 路由名称
     */
    private String name;

    /**
     * route类型
     */
    private RouterType routerType;

    /**
     * 路由策略集合
     */
    private List<RouterStrategy> routerStrategy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RouterType getRouterType() {
        return routerType;
    }

    public void setRouterType(RouterType routerType) {
        this.routerType = routerType;
    }

    public List<RouterStrategy> getRouterStrategy() {
        return routerStrategy;
    }

    public void setRouterStrategy(List<RouterStrategy> routerStrategy) {
        this.routerStrategy = routerStrategy;
    }
}
