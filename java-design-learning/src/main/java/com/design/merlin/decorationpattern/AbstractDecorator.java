package com.design.merlin.decorationpattern;

/**
 * @author Merlin
 * @Title: AbstractDecorator
 * @ProjectName java-base-learning
 * @Description: 抽象装饰类继承抽象类
 * @date 2019/3/611:15
 */
public class AbstractDecorator extends ABattercake{

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}
