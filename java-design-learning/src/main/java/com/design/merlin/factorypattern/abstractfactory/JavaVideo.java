package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: JavaVideo
 * @ProjectName java-base-learning
 * @Description: Java视频类
 * @date 2019/3/415:30
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
