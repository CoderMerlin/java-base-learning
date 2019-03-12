package com.design.merlin.bridgingpattern;

/**
 * @author Merlin
 * @Title: ICBCBank
 * @ProjectName java-base-learning
 * @Description: 中国工商银行账号
 * @date 2019/3/1215:12
 */
public class ICBCBank extends Bank {
    /**
     * 组合的时候，可以通过构造器的方式来进行注入也可以通过set方法的方式来进行注入
     *
     * @param account
     */
    public ICBCBank(Account account) {
        super(account);
    }


    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        return account;
    }
}
