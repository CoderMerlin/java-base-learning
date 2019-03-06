package com.design.merlin.decorationpattern;

/**
 * @author Merlin
 * @Title: BattercakeWithEgg
 * @ProjectName java-base-learning
 * @Description: 煎饼加鸡蛋类
 * @date 2019/3/611:05
 */
public class BattercakeWithEgg extends Battercake{


    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }

}
