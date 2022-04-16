package com.loving.jun.desingmodel.Propotype;

/**
 * @Author: yijunjun
 * @Date: 2022/4/16 10:12
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) throws CloneNotSupportedException{
        this.workExperience = workExperience.clone();
    }

    //设置个人信息
    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void SetWorkExperience(String timeArea,String company){
        workExperience.setWorkDate(timeArea);
        workExperience.setCompany(company);
    }

    // 显示
    public void display(){
        System.out.println(name + "  "+ sex + "  "+ age);
        System.out.println(workExperience.getWorkDate() + "   "+ workExperience.getCompany());
    }

    // 这种复制是“浅”复制，workExperience 只是复制了
    // 被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向原来的对象
   /* @Override
    protected Resume clone() throws CloneNotSupportedException {
        return (Resume)super.clone();
    }*/

    /**
     * 实现深复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExperience);
        resume.name = this.name;
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }
}
