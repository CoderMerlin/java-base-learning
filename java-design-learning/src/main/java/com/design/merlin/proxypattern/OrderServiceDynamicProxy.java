package com.design.merlin.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Merlin
 * @Title: OrderServiceDynamicProxy
 * @ProjectName java-base-learning
 * @Description: 动态代理类
 * @date 2019/3/1216:24
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    /** 这是目标类 */
    private Object target;

    /** 通过构造器把目标类注入进来 */
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }
    /** 进行绑定 */
    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    public void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理before code");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        /** 这里就是实现一个分库的功能,对userId取模2，这里就只会得到0或者是1 */
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");
        //todo 设置dataSource;
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }
    public void afterMethod() {
        System.out.println("动态代理after core");
    }
}
