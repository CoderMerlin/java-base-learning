package com.design.merlin.decorationpattern;

/**
 * @author Merlin
 * @Title: BattercakeWithEggSausage
 * @ProjectName java-base-learning
 * @Description: 煎饼加鸡蛋加香肠类
 * @date 2019/3/611:06
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{

    @Override
    public String getDesc() {
        return super.getDesc()+"一个香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
