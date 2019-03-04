package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: JavaArticle
 * @ProjectName java-base-learning
 * @Description: java手记类
 * @date 2019/3/415:32
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
