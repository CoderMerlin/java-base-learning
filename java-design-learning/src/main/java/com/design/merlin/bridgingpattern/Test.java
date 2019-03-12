package com.design.merlin.bridgingpattern;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 *
 * @date 2019/3/1214:51
 */
public class Test {

    /*
    业务场景：中国有很多银行，有中国农业银行和中国工商银行；关于我们的账号，有定期账号和活期账号，
            一个就是银行一个就是我们的账号；
     */

    public static void main(String[] args) {

        Bank abcBank = new ABCBank(new DepositAccount());
        Account account = abcBank.openAccount();
        account.showAccountType();

        Bank abcBank1 = new ABCBank(new SavingAccount());
        Account account1 = abcBank1.openAccount();
        account1.showAccountType();

        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account account2 = icbcBank.openAccount();
        account2.showAccountType();

        /**
         * 扩展阅读：
         * jdbc里面的Driver
         */
    }


}
