package com.design.merlin.builderpattern;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/416:57
 */
public class Test {


    public static void main(String[]args){
        /** 利用多态，抽象类的引用指向子类的实现 */
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        /** 这里利用set方法注入进去 */
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式", "Java设计模式PPT", "Java设计模式视频", "Java设计模式手记", "Java设计模式问答");
        System.out.println(course); //输出：Course{courseName='Java设计模式', coursePPT='Java设计模式PPT', courseVideo='Java设计模式视频', courseArticle='Java设计模式手记', courseQA='Java设计模式问答'}

        /*
        总结：
        优点：1.封装性好，创建和使用分离
             2.扩展性好，建造类之间独立，一定程度上解耦

        缺点：1.产生多余的Builder对象
             2.产品内部发生变化，建造者都要修改，成本较大
         */

        /*
        扩展阅读：
            1.JDK 中 StringBuilder，不过方法中加入了synchronized
            2.Guava 中的 ImmutableSet
            3.Spring中的 BeanDefinitionBuilder
         */
    }
}
