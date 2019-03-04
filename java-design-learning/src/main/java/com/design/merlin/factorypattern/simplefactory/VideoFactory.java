package com.design.merlin.factorypattern.simplefactory;

/**
 * @author merlin
 * @Title: VideoFactory
 * @ProjectName java-design-pattern
 * @Description: 视频工厂类
 * @date 2019/3/321:42
 */
public class VideoFactory {

    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
