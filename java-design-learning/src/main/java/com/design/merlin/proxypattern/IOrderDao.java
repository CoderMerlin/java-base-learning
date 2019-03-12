package com.design.merlin.proxypattern;

/**
 * @author Merlin
 * @Title: IOrderDao
 * @ProjectName java-base-learning
 * @Description: 订单Dao层
 * @date 2019/3/1215:56
 */
public interface IOrderDao {

    int insert(Order order);
}
