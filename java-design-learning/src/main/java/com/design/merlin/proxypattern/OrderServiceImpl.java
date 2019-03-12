package com.design.merlin.proxypattern;

/**
 * @author Merlin
 * @Title: OrderServiceImpl
 * @ProjectName java-base-learning
 * @Description: 订单Service 实现层
 * @date 2019/3/1216:06
 */
public class OrderServiceImpl implements IOrderService {


    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        /** Spring会自己注入，我们这里就直接new出来了 */
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service调用Dao层添加Order层");
        return iOrderDao.insert(order);
    }
}
