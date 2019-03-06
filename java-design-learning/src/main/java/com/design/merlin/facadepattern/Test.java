package com.design.merlin.facadepattern;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/610:27
 */
public class Test {

    public static void main(String[]args) {
        /*PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(pointsGift);*/

        //以上可以看出需要实例化每个子系统。我们可以学习spring GiftExchangeService类中，直接实例化子系统
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);

        /*
        扩展阅读：
           JdbcUtils
         */
    }
}
