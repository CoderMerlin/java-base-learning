package com.design.merlin.proxypattern;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/1215:44
 */
public class Test {

    /**
     * 这里引入的就是分库的一个业务场景
     * 静态代理：
     */

    public static void main(String[] args) {

        //静态代理
        Order order = new Order();
        order.setUserId(1);
        /** 这里没有采用spring自动注入的方式，而是采用了直接new的方式 */
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

        //动态代理
        Order order2 = new Order();
        order2.setUserId(2);
        /** 这里没有采用spring自动注入的方式，而是采用了直接new的方式 */
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order2);

    }
}
