package com.design.merlin.factorypattern.simplefactory;

/**
 * @author merlin
 * @Title: PythonVideo
 * @ProjectName java-design-pattern
 * @Description: 录制Python视频
 * @date 2019/3/321:41
 */
public class PythonVideo extends Video{
    @Override
    public void product() {
        System.out.println("录制Python课程视频");
    }
}
