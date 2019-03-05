package com.design.merlin.singletonpattern.enumsingleton;

/**
 * @author Merlin
 * @Title: EnumInstance
 * @ProjectName java-base-learning
 * @Description: 枚举单例模式
 * @date 2019/3/515:15
 */
public enum  EnumInstance {

    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
