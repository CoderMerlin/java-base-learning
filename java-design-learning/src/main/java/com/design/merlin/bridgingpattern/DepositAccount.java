package com.design.merlin.bridgingpattern;

/**
 * @author Merlin
 * @Title: DepositAccount
 * @ProjectName java-base-learning
 * @Description: 定期账号
 * @date 2019/3/1214:53
 */
public class DepositAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
