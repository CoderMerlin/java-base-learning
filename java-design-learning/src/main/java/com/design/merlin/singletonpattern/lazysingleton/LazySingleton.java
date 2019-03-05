package com.design.merlin.singletonpattern.lazysingleton;

/**
 * @author Merlin
 * @Title: LazySingleton
 * @ProjectName java-base-learning
 * @Description: 懒汉式单例
 * @date 2019/3/417:24
 */
public class LazySingleton {

    /**
     * 懒汉模式的话，开始没有进行初始化
     */
    private static LazySingleton lazySingleton = null;

    /**
     * 构造器要进行私有化
     */
    private LazySingleton(){

    }

    //解决线程安全问题方法一：
    public /*synchronized*/ static LazySingleton getInstance(){
        /**
         * 这个是有线程安全的问题
         */
        //解决线程安全问题方法二：
        /*synchronized (LazySingleton.class){*/
            if(lazySingleton == null){
                /**
                 * 如果一个线程进来了，但是这个时候，在new实例的时候，阻塞了或者还没有new 出实例，
                 * 这个时候，另外一个线程判断lazySinglenton依然是空的，那么久这时候，也进来了，
                 * 那么这个时候，就是线程安全问题的。
                 */
                lazySingleton = new LazySingleton();
            }
        /*}*/

        return lazySingleton;
    }
}
