package com.design.merlin.proxypattern;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Merlin
 * @Title: DynamicDataSource
 * @ProjectName java-base-learning
 * @Description: Spring里面的分库
 * @date 2019/3/1216:10
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }

}
