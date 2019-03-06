package com.design.merlin.adapterpattern;

/**
 * @author Merlin
 * @Title: ConcreteTarget
 * @ProjectName java-base-learning
 * @Description: 具体的实现类
 * @date 2019/3/614:00
 */
public class ConcreteTarget implements Target{


    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
