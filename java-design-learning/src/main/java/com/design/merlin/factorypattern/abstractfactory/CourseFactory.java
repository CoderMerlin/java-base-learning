package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: CourseFactory
 * @ProjectName java-base-learning
 * @Description: 课程接口工厂类
 * @date 2019/3/415:26
 */
public interface CourseFactory {

    /** 获取视频 */
    Video getVideo();

    /** 获取手记 */
    Article getArticle();
}
