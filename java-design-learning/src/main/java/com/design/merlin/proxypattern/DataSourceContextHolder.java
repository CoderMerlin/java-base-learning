package com.design.merlin.proxypattern;

/**
 * @author Merlin
 * @Title: DataSourceContextHolder
 * @ProjectName java-base-learning
 * @Description: ThreadLocal
 * @date 2019/3/1216:09
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return (String)CONTEXT_HOLDER.get();
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }
}
