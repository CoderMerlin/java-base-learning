package com.design.merlin.singletonpattern.hungrysingleton.reflectionattack;

/**
 * @author Merlin
 * @Title: StaticInnerClassSingleton
 * @ProjectName java-base-learning
 * @Description: 静态内部类
 * @date 2019/3/515:11
 */
public class StaticInnerClassSingleton {

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
