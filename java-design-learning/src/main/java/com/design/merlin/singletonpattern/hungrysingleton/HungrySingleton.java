package com.design.merlin.singletonpattern.hungrysingleton;

/**
 * @author Merlin
 * @Title: HungrySingleton
 * @ProjectName java-base-learning
 * @Description: 饿汉模式
 * 特点：
 * 在类加载的时候，就完成了实例化，避免了线程同步的问题，缺点就是在类加载的时候，就完成了初始化，
 * 没有延迟加载，这个时候，就是会造成内存的浪费
 * @date 2019/3/5 13:34
 */
public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
    //另一种写法：
    /*
    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton() {

    }
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
     */
    //饿汉式和懒汉式最大的区别就是在有没有延迟加载
}
