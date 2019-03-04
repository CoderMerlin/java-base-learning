package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/414:52
 */
public class Test {

    public static void main(String[]args){

        //需求：获得java课程视频 / python课程视频
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.product(); //录制Java课程视频

        //需求:新增一个spring课程
        //分析：我们只需要定义一个spring普通类，继承Video抽象类。 定义一个spring工程类来调用spring普通类
        VideoFactory videoFactory2 = new SpringVideoFactory();
        Video video2 = videoFactory2.getVideo();
        video2.product(); //录制Spring课程视频

        /*
        总结：
        抽象工厂，子类的具体实现的工厂
        抽象产品，子类的具体的产品
        把抽象方法交给子类来进行实现
         */

        /*
         扩展知识： JDK+logback
         1.ArrayList里面的iterator方法使用了方法工厂模式
         2.URLStreamHandlerFactory
         */
    }
}
