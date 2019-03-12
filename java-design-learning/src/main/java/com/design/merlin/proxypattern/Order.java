package com.design.merlin.proxypattern;

/**
 * @author Merlin
 * @Title: Order
 * @ProjectName java-base-learning
 * @Description: 订单类
 * @date 2019/3/1215:45
 */
public class Order {

    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
