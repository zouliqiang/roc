package com.roc.engine.common.util;

/**
 * @Description 字符串工具类
 * @date  2020年6月13日下午2:14:24
 * @version V1.0  
 * @author 邹立强
 * <p>Copyright (c) Department of Research and Development/Beijing.</p>
 */
public class StringUtil {

    /**
     * @Description 字符串是否为空 
     * @param str
     * @return boolean     
     * @version V1.0
     * @auth    邹立强
     * 2020年6月13日 下午2:18:18
     */
    public static boolean isBlank(String str) {
        if (str != null && str.length() > 0) {
            return false;
        }
        return true;
    }

    /**
     * @Description 字符串是否不为空
     * @param str
     * @return boolean     
     * @version V1.0
     * @auth    邹立强
     * 2020年6月13日 下午2:19:11
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
    
    /**
     * @Description 连接字符串 
     * @param strs
     * @return String     
     * @version V1.0
     * @auth    邹立强
     * 2020年6月13日 下午2:23:45
     */
    public static String connect(String... strs) {
        if (strs == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
