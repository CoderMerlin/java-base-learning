package com.design.merlin.flyweightpattern;

/**
 * @author Merlin
 * @Title: Manager
 * @ProjectName java-base-learning
 * @Description: 经理类
 * @date 2019/3/615:17
 */
public class Manager implements Employee {


    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }
    /** 我们可以在外部来重置年终报告 */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
