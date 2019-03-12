package com.design.merlin.bridgingpattern;

/**
 * @author Merlin
 * @Title: Bank
 * @ProjectName java-base-learning
 * @Description: 银行类
 * 将Account账户接口组合到这个银行类
 * @date 2019/3/1214:56
 */
public abstract class Bank {

    /** 只有子类能拿到这个Account的这个接口 */
    protected Account account;

    /** 组合的时候，可以通过构造器的方式来进行注入也可以通过set方法的方式来进行注入 */
    public Bank(Account account) {
        this.account = account;
    }

    /** 这里声明成和接口里面的方法名一致，只是方便理解，Bank里面的方法要委托给Account接口里面的方法 */
    abstract Account openAccount();

    /**
     * 我们现在看到就是Account就是具体的实现，我们要通过这个接口的具体实现，而Bank就是抽象，
     * 它是一个抽象类，然后这个抽象类里面的某个行为委托给Account的这个接口；
     * 在前面有说到桥接模式指的就是抽象和实现分离；而这里的实现正式这里的Account的实现类；
     */
}
