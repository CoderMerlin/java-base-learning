package com.design.merlin.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Merlin
 * @Title: EmployeeFactory
 * @ProjectName java-base-learning
 * @Description: 经理工厂类
 * @date 2019/3/615:21
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理"+department);
            String reportContent = department+"部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println("    创建报告"+reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
