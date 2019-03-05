package com.design.merlin.singletonpattern.lazysingleton;

/**
 * @author Merlin
 * @Title: LazyDoubleCheckSingleton
 * @ProjectName java-base-learning
 * @Description: DoubleCheck双重检查 懒汉模式
 * @date 2019/3/510:43
 */
public class LazyDoubleCheckSingleton {

    /** 懒汉模式的话，开始没有进行初始化 */
    //引入volatile  保证内存可见性
    private /*volatile*/ static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    /** 构造器要进行私有化 */
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance() {
        //如果线程进来，实例已经有值了，这个时候，就直接return返回了。就不用经过synchronized锁阻塞了，大幅度提高了性能。
        //第一重检查就是为了如果线程过来，如果不为空，就直接返回，不用经过锁
        /*
        这种双重检查 会有一个问题：发生重排序
         */
        /** 如果2和3进行重排序，那么这里的判断并不为空，这个时候，实际上对象还没有初始化好，就可以进行这个判断 */
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //第二重，如果是空的话，那么就进行实例化
                if (lazyDoubleCheckSingleton == null) {
                    /**
                     * 实际上有三个步骤：
                     * 1.分配内存给这个对象
                     * 2.初始化对象
                     * 3.设置lazyDoubleCheckSingleton指向刚分配的内存地址
                     * 2和3的顺序有可能会被颠倒，
                     *
                     * 这个时候，就规定所有的线程在执行java程序的时候，必须要遵守intra-thread semantics这么一个规定
                     * 它保证了重排序不会改变单线程内的程序执行结果
                     */
                    lazyDoubleCheckSingleton =  new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
