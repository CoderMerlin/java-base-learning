package com.design.merlin.decorationpattern;

/**
 * @author Merlin
 * @Title: SausageDecorator
 * @ProjectName java-base-learning
 * @Description: 煎饼添加鸡蛋的装饰类继承于抽象的装饰类：
 * @date 2019/3/613:20
 */
public class SausageDecorator extends AbstractDecorator{


    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
