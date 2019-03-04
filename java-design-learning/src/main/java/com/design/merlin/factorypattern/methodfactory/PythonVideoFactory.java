package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: PythonVideoFactory
 * @ProjectName java-base-learning
 * @Description: python 工厂类
 * @date 2019/3/414:49
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
