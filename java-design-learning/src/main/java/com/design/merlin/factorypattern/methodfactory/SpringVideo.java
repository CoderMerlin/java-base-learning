package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: SpringVideo
 * @ProjectName java-base-learning
 * @Description: spring课程视频
 * @date 2019/3/414:59
 */
public class SpringVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Spring课程视频");
    }
}
