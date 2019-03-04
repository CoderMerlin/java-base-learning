package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: PythonCourseFactory
 * @ProjectName java-base-learning
 * @Description: Python产品族的课程工厂
 * @date 2019/3/416:12
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
