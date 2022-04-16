package com.loving.jun.desingmodel.Propotype;

/**
 * @Author: yijunjun
 * @Date: 2022/4/16 10:21
 */
public class WorkExperience implements Cloneable{ // 实现cloneable接口，进行深复制
    private String workDate;

    private String company;

    public String getWorkDate() {
        return workDate;
    }


    @Override
    public WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience)super.clone();
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
