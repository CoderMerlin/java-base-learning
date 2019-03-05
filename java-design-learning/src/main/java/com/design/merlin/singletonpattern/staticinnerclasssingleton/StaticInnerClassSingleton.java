package com.design.merlin.singletonpattern.staticinnerclasssingleton;

/**
 * @author Merlin
 * @Title: StaticInnerClassSingleton
 * @ProjectName java-base-learning
 * @Description: 静态内部类-基于类初始化的延迟加载解决方案及原理解析
 * @date 2019/3/513:30
 */
public class StaticInnerClassSingleton {


    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){

    }
}
