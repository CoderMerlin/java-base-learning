package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: JavaCourseFactory
 * @ProjectName java-base-learning
 * @Description: 创建java产品族的课程工厂
 * 这里讲视频工厂和手记工厂合在一起作为一个产品族
 * @date 2019/3/415:27
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
