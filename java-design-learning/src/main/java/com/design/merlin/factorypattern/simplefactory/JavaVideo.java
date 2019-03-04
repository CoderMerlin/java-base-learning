package com.design.merlin.factorypattern.simplefactory;

/**
 * @author merlin
 * @Title: JavaVideo
 * @ProjectName java-design-pattern
 * @Description: 录制Java视频
 * @date 2019/3/321:40
 */
public class JavaVideo  extends Video{

    @Override
    public void product() {
        System.out.println("录制Java课程视频");
    }
}
