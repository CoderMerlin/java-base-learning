package com.design.merlin.proxypattern;

/**
 * @author Merlin
 * @Title: OrderDaoImpl
 * @ProjectName java-base-learning
 * @Description: 订单Dao层实现
 * @date 2019/3/1215:58
 */
public class OrderDaoImpl implements IOrderDao {


    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加order成功");
        return 1;
    }
}
