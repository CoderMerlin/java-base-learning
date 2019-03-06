package com.design.merlin.decorationpattern;

/**
 * @author Merlin
 * @Title: EggDecorator
 * @ProjectName java-base-learning
 * @Description: 煎饼添加鸡蛋的装饰类继承于抽象的装饰类
 * @date 2019/3/611:28
 */
public class EggDecorator extends AbstractDecorator{


    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
