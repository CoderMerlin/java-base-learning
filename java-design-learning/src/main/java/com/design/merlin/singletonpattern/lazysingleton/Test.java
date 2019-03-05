package com.design.merlin.singletonpattern.lazysingleton;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/417:29
 */
public class Test {

    public static void main(String[] args){
        //懒汉模式，存在线程安全问题
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        //System.out.println(lazySingleton);
        //验证：使用多线程验证
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
        //解决方法一：在获取实例的方法上添加synchronized关键字
        //如果锁加在静态方法上，那么就相当于锁是加在这个类的class文件，如果不是静态文件相当于是在堆内存中生成的对象
        //解决方法二：把获取实例的方法内添加synchronized代码块

        /*
        但是，我们知道在加锁和解锁的时候，是会带来额外的开销，对性能会有一定的影响，我们进一步推进
        在性能和安全上进行平衡。
         */
        //优化：双重检查 懒汉模式  LazyDoubleCheckSingleton.class
        /*
        双重检查会存在一个问题：重排序
         */
        //继续优化：引入volatile关键词，共享
        /*
        通过volatile和doubleCheck的这种方式既兼顾了性能，又兼顾了线程安全的问题;
         */


    }
}
