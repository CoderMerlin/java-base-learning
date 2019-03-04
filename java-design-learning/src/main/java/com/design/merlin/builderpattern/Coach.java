package com.design.merlin.builderpattern;

/**
 * @author Merlin
 * @Title: Coach
 * @ProjectName java-base-learning
 * @Description: 教练类
 * @date 2019/3/4 16:55
 */
public class Coach {

    private CourseBuilder courseBuilder;
    /** 这里的CourseBuilder通过set的方式给注入进来 */
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
