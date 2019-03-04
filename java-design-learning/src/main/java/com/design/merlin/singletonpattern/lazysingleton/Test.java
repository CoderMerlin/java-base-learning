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
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
