package com.design.merlin.adapterpattern;

/**
 * @author Merlin
 * @Title: Adapter
 * @ProjectName java-base-learning
 * @Description: 继承于被适配类，实现目标方法的接口
 * @date 2019/3/614:06
 */
public class Adapter /*extends Adaptee*/ implements Target {

    private Adaptee adaptee = new Adaptee();


    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
