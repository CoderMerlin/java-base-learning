package com.design.merlin.builderpattern;

/**
 * @author Merlin
 * @Title: CourseBuilder
 * @ProjectName java-base-learning
 * @Description: TODO
 * @date 2019/3/416:46
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
