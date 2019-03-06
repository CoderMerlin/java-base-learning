package com.design.merlin.adapterpattern;

/**
 * @author Merlin
 * @Title: PowerAdapter
 * @ProjectName java-base-learning
 * @Description: 适配类
 * @date 2019/3/615:03
 */
public class PowerAdapter implements DC5{

    private AC220V ac220V = new AC220V();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220V.outputAC220V();
        /** 变压器 */
        int adapterOutput = adapterInput / 44;
        System.out.println("通过PowerAdapter电源适配器输入AC"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
