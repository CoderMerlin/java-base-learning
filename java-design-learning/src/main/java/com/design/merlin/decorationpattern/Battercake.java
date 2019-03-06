package com.design.merlin.decorationpattern;

/**
 * @author Merlin
 * @Title: Battercake
 * @ProjectName java-base-learning
 * @Description: 煎饼类
 * @date 2019/3/611:02
 */
public class Battercake extends ABattercake{

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
