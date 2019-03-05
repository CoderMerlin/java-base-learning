package com.design.merlin.singletonpattern.hungrysingleton;

import java.io.*;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类：
 * 1.测试序列化破坏单例模式原理解析及解决方案
 * @date 2019/3/513:39
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        HungrySingletonSerializable instance = HungrySingletonSerializable.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingletonSerializable newInstance = (HungrySingletonSerializable) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
        //通过序列化和反序列化拿了不同的对象;而我们希望拿到的是同一的对象，修改

    }
}
