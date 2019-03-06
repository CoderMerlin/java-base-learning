package com.design.merlin.decorationpattern;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/611:07
 */
public class Test {

    public static void main(String[]args){

        //通过继承方式
        /*Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+"销售价格:"+battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+"销售价格:"+battercakeWithEgg.cost());

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+"销售价格:"+battercakeWithEggSausage.cost());*/
        //假如这个时候，有一个人加了两个鸡蛋，这个时候，根据上面的就是不能算出价格的;

        //下面通过装饰模式来演进
        //写一个Abattercake 抽象类，Battercake煎饼类继承抽象类Abattercake
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+"价格为:"+aBattercake.cost());

        /*
        扩展阅读：
            BufferedReader
         */
    }
}
