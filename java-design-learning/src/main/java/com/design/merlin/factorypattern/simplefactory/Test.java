package com.design.merlin.factorypattern.simplefactory;

/**
 * @author merlin
 * @Title: Test
 * @ProjectName java-design-pattern
 * @Description: 测试类
 * @date 2019/3/321:45
 */
public class Test {

    public static void main(String[] args) {

        //方法一：
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.product(); //输出：录制Java课程视频

        //由方法一，我们可以知道，如果我们还要录制其他课程的话，那么我们就需要
        //对工厂类里面的方法进行扩展，那么就并不符合开闭原则。

        //方法二：使用反射进行优化
        ReflexVideoFactory reflexVideoFactory = new ReflexVideoFactory();
        Video video1 = reflexVideoFactory.getVideo(JavaVideo.class);
        if(video1 == null){
            return;
        }
        video1.product(); //输出：录制Java课程视频

        /*
        总结： JDK源码中涉及到的简单工厂模式:
                   1.Calendar类 获取多语言
                   2.DriverManager 里面的getConnection()方法
         */

    }
}
