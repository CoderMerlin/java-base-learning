package com.design.merlin.proxypattern;

/**
 * @author Merlin
 * @Title: IOrderService
 * @ProjectName java-base-learning
 * @Description: 订单Service层
 * @date 2019/3/1215:59
 */
public interface IOrderService {

    /** 保存订单，参数为订单对象，返回值为生效行数 */
    int saveOrder(Order order);
}
