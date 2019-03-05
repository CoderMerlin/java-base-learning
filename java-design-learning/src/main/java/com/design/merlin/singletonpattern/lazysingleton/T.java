package com.design.merlin.singletonpattern.lazysingleton;

/**
 * @author Merlin
 * @Title: T
 * @ProjectName java-base-learning
 * @Description: 多线程测试单例懒汉模式
 * @date 2019/3/510:10
 */
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);
    }
}
