package com.design.merlin.builderpattern;

/**
 * @author Merlin
 * @Title: CourseActualBuilder
 * @ProjectName java-base-learning
 * @Description: 实现CourseBuilder的子类
 * @date 2019/3/416:51
 */
public class CourseActualBuilder extends CourseBuilder{

    /** 这里把课程组合到实际的Builde当中 */
    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
