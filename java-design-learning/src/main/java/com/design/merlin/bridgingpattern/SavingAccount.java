package com.design.merlin.bridgingpattern;

/**
 * @author Merlin
 * @Title: SavingAccount
 * @ProjectName java-base-learning
 * @Description: 活期账号
 * @date 2019/3/1214:55
 */
public class SavingAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
