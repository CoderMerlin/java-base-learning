package com.design.merlin.flyweightpattern;

/**
 * @author Merlin
 * @Title: Test
 * @ProjectName java-base-learning
 * @Description: 测试类
 * @date 2019/3/615:15
 */
public class Test {

    //场景：有一个场景，公司要求各个部门的管理者做一下年底总结报告，
    //如果这些报告都已经生成过了，那么我们就没有必要再去new一个了；我们通过这么一个场景来体现一下享元模式：
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[]args){
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
        }
    }
    //我们在使用享元模式的时候，一定要注意线程安全的问题；
    //我们要理解好内部状态和外部的状态；

    /*
    扩展阅读：
        1.Integer类里面的valueOf方法；
        2.IntegerCache
        3.tomcat的连接池：GenericObjectPoolConfig
     */
}
