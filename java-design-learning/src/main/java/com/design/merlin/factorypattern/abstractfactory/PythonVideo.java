package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: PythonVideo
 * @ProjectName java-base-learning
 * @Description: python视频类
 * @date 2019/3/416:04
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python的视频");
    }
}
