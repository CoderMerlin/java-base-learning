package com.design.merlin.facadepattern;

/**
 * @author Merlin
 * @Title: ShippingService
 * @ProjectName java-base-learning
 * @Description: 物流子系统
 * @date 2019/3/610:22
 */
public class ShippingService {


    public String shipGift(PointsGift pointsGift) {
        /** 物流系统对接逻辑 */
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
