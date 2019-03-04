package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: SpringVideoFactory
 * @ProjectName java-base-learning
 * @Description: Spring视频工厂类
 * @date 2019/3/415:00
 */
public class SpringVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new SpringVideo();
    }
}
