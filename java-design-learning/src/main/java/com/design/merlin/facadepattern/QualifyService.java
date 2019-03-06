package com.design.merlin.facadepattern;

/**
 * @author Merlin
 * @Title: QualifyService
 * @ProjectName java-base-learning
 * @Description: 校验类
 * @date 2019/3/6 10:19
 */
public class QualifyService {


    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验"+pointsGift.getName()+"积分资格通过,库存通过");
        return true;
    }
}
