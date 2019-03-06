package com.design.merlin.adapterpattern;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/614:08
 */
public class Test {

    public static void main(String[]args){

        //方式一：
        Target target = new ConcreteTarget();
        target.request();

        /** 现在，我们就来通过适配器类来进行实现 */
        Target adapterTarget = new Adapter();
        adapterTarget.request();

        //方式二：在Adapter类中 new Adaptee(); 与方法一输出一致。
        //在继承和组合的时候，优先使用组合

        //举例：手机充电器的适配器，将220V的交流电转换成5V的直流电：
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

        /*
        扩展阅读：
           1. XmlAdapter
           2. AdvisorAdapter
           3. 在JPA里面也大量的使用到适配器模式
           4. HandlerAdapter
         */
    }

}
