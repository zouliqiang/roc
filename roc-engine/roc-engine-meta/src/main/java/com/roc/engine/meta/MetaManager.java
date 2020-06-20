package com.roc.engine.meta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import com.roc.engine.common.code.MetaErrorCode;
import com.roc.engine.common.exception.MetaException;
import com.roc.engine.common.util.StringUtil;
import com.roc.engine.meta.domain.Region;
import com.roc.engine.meta.domain.Table;

/**
 * @Description 元数据管理器
 * @date  2020年6月13日下午1:33:57
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class MetaManager {

    private static Map<String, Region> regions;

    private static Map<String, Table> tables;

    /**
     * @Description 元数据初始化 
     * @param region    
     * @return void     
     * @version V1.0
     * @auth    邹立强
     * 2020年6月13日 下午2:36:58
     */
    public static void initMeta(List<Region> regionList) {
        if (regionList == null) {
            new MetaException(MetaErrorCode.ROC_ENGINE_META_ERROR_100001.getCode(), MetaErrorCode.ROC_ENGINE_META_ERROR_100001.getMsg());
        }
        regions = new ConcurrentHashMap<String, Region>();
        tables = new ConcurrentHashMap<String, Table>();
        for (Region region : regionList) {
            String regionName = region.getName();
            regions.put(regionName, region);
            List<Table> tablesList = region.getTables();
            for (Table table : tablesList) {
                tables.put(StringUtil.connect(regionName, ".", table.getName()), table);
            }
        }
    }

    /**
     * @Description 删除表 
     * @param regionName
     * @param tableName    
     * @return void     
     * @version V1.0
     * @auth    邹立强
     * 2020年6月13日 下午3:29:34
     */
    public static void removeTable(String regionName, String tableName) {
        if (StringUtil.isBlank(regionName) || StringUtil.isBlank(tableName)) {
            new MetaException(MetaErrorCode.ROC_ENGINE_META_ERROR_100002.getCode(), MetaErrorCode.ROC_ENGINE_META_ERROR_100002.getMsg());
        }
        tables.remove(StringUtil.connect(regionName, ".", tableName));
        Region region = regions.get(regionName);
        if (region != null) {
            List<Table> tableList = region.getTables();
            tableList = tableList.stream().filter(table -> !table.getName().equals(tableName)).collect(Collectors.toList());
            if (tableList != null && tableList.size() > 0) {
                region.setTables(tableList);
                regions.put(regionName, region);
            }
        }
    }

    /**
     * @Description 添加表 
     * @param regionName
     * @param table    
     * @return void     
     * @version V1.0
     * @auth    邹立强
     * 2020年6月13日 下午3:51:27
     */
    public static void addTable(String regionName, Table table) {
        if (StringUtil.isBlank(regionName) || table != null) {
            new MetaException(MetaErrorCode.ROC_ENGINE_META_ERROR_100002.getCode(), MetaErrorCode.ROC_ENGINE_META_ERROR_100002.getMsg());
        }
        tables.put(StringUtil.connect(regionName, ".", table.getName()), table);
        Region region = regions.get(regionName);
        if (region != null) {
            region.getTables().add(table);
        } else {
            List<Table> tableList = new ArrayList<Table>();
            tableList.add(table);
            Region newRegion = new Region();
            newRegion.setName(regionName);
            newRegion.setTables(tableList);
        }
    }
    
    /**
     * @Description 编辑表 
     * @param regionName
     * @param table    
     * @return void     
     * @version V1.0
     * @auth    邹立强
     * 2020年6月13日 下午4:01:56
     */
    public static void editTable(String regionName, Table table) {
        if (StringUtil.isBlank(regionName) || table != null) {
            new MetaException(MetaErrorCode.ROC_ENGINE_META_ERROR_100002.getCode(), MetaErrorCode.ROC_ENGINE_META_ERROR_100002.getMsg());
        }
        tables.put(StringUtil.connect(regionName, ".", table.getName()), table);
        Region region = regions.get(regionName);
        if (region != null) {
            List<Table> tablesList = region.getTables();
            int index = 0;
            for (int i = 0; i < tablesList.size(); i++) {
                Table t = tablesList.get(i);
                if (t != null && table.getName().equals(t.getName())) {
                    index = i;
                    break;
                }
            }
            tablesList.set(index, table);
        }
    }
}
