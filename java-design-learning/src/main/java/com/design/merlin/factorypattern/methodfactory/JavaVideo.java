package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: JavaVideo
 * @ProjectName java-base-learning
 * @Description: Java视频录制类
 * @date 2019/3/414:30
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
