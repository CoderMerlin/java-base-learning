package com.design.merlin.singletonpattern.hungrysingleton;

/**
 * @author Merlin
 * @Title: HungrySingletonSerializable
 * @ProjectName java-base-learning
 * @Description: 饿汉模式  序列化破坏单例模式原理解析
 * @date 2019/3/513:43
 */
public class HungrySingletonSerializable {

    private final static HungrySingletonSerializable hungrySingletonSerializable;
    static {
        hungrySingletonSerializable = new HungrySingletonSerializable();
    }
    private HungrySingletonSerializable() {
        if(hungrySingletonSerializable != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


    public static HungrySingletonSerializable getInstance() {
        return hungrySingletonSerializable;
    }
    /** 我们加上这样的一个方法 */
    private Object readResolve() {
        return hungrySingletonSerializable;
    }
}
