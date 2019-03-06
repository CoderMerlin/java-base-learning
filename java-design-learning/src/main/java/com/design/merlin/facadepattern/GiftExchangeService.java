package com.design.merlin.facadepattern;

/**
 * @author Merlin
 * @Title: GiftExchangeService
 * @ProjectName java-base-learning
 * @Description: 积分交换交易
 * @date 2019/3/610:23
 */
public class GiftExchangeService {

    /*private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;*/

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            /** 资格检验通过 */
            if (pointsPaymentService.pay(pointsGift)) {
                //如果积分支付成功,那么就是可以返回订单号了
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流订单系统下单成功，订单号是："+shippingOrderNo);
            }
        }
    }

}
