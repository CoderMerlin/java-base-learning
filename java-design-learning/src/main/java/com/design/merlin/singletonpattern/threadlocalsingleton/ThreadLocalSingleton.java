package com.design.merlin.singletonpattern.threadlocalsingleton;

/**
 * @author Merlin
 * @Title: ThreadLocalSingleton
 * @ProjectName java-base-learning
 * @Description: ThreadLocal线程单例
 * @date 2019/3/5 15:55
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){

    }


    public ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }

}
