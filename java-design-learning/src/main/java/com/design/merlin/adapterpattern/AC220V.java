package com.design.merlin.adapterpattern;

/**
 * @author Merlin
 * @Title: AC220V
 * @ProjectName java-base-learning
 * @Description: 被适配的类 220V
 * @date 2019/3/614:58
 */
public class AC220V {

    public int outputAC220V() {
        int output = 220;
        System.out.println("输出220V的交流电"+output+"V");
        return output;
    }

}
