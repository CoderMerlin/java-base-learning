package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/415:16
 */
public class Test {

    public static void main(String[] args) {

        /*
        新的需求:
        每一个课程不仅仅要有视频，还要有对应的手记，如果用工厂方法的方式来进行扩展的话
        这个时候，既要有java的手记类，python的手记类，spring的手记类，
        还有手记的抽象类，手记的工厂，java的手记的工厂，python的手记的工厂，spring的手记的工厂，这个时候，就很容易出现类爆炸的现象;
        原来是一个视频是一个课程，现在一个视频加上一个手记是一个课程;
        java视频，python视频，fe视频他们属于同一产品等级，都是视频
        java手记，python手记，fe手记他们也属于同一产品等级，都是手记

        而java手记，java视频他们处于同一产品族，都是java相关的;
        同一产品族，我们就看java，还是python还是spring;
        同一产品等级，我们就看它是视频还是手记即可;
         */

        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        /** 只要是从Java产品族里面拿的肯定是Java的视频和Java的手记 */
        article.produce(); //输出：编写Java课程手记
        video.produce();  //输出：录制Java课程视频

        /*
        总结：
        优点: 解耦程度高；
             在使用抽象工厂的时候，尽量找那种固定程度比较高的，像课程里面的视频和手记，视频和手记都是必须要有的，就可以用抽象工厂模式来解决;
        缺点：在新增产品等级的时候，会比较的麻烦;
             如果在现有的产品族里面添加新的产品等级，就违背了开闭原则了;
             如果我们还要把源码放到课程的这个产品族里面，那么对原来的修改就比较大了;
         */

        /*
        扩展：
           1.Connection接口 返回的Statement 还有返回PrepareStatement
           2.SqlSessionFactory
         */
    }
}
