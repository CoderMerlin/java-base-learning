package com.design.merlin.singletonpattern.hungrysingleton.reflectionattack;

import com.design.merlin.singletonpattern.hungrysingleton.HungrySingletonSerializable;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类  反射攻击解决方案及原理分析
 * @date 2019/3/514:54
 */
public class Test {
    public static void main(String[]args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = HungrySingletonSerializable.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingletonSerializable instance = HungrySingletonSerializable.getInstance();
        HungrySingletonSerializable newInstance = (HungrySingletonSerializable) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}
