package com.design.merlin.facadepattern;

/**
 * @author Merlin
 * @Title: PointsPaymentService
 * @ProjectName java-base-learning
 * @Description: 积分支付类
 * @date 2019/3/610:20
 */
public class PointsPaymentService {


    public boolean pay(PointsGift pointsGift) {
        /** 扣减积分 */
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }
}
