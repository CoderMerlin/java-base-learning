package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: JavaVideoFactory
 * @ProjectName java-base-learning
 * @Description: java 视频工厂类
 * @date 2019/3/414:47
 */
public class JavaVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
