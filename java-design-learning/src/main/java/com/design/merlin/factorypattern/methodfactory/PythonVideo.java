package com.design.merlin.factorypattern.methodfactory;

/**
 * @author Merlin
 * @Title: PythonVideo
 * @ProjectName java-base-learning
 * @Description: python课程录制类
 * @date 2019/3/414:31
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
