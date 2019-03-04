package com.design.merlin.factorypattern.abstractfactory;

/**
 * @author Merlin
 * @Title: pythonArticle
 * @ProjectName java-base-learning
 * @Description: python课程手记
 * @date 2019/3/415:49
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
