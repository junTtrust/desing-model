package com.loving.jun.desingmodel.Propotype;

/**
 * @Author: yijunjun
 * @Date: 2022/4/16 10:30
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Resume xiaoming = new Resume("小明");
        xiaoming.setPersonalInfo("男","29");
        xiaoming.SetWorkExperience("1998-2006","XX公司");

        Resume xiaohong = xiaoming.clone();
        xiaohong.SetWorkExperience("1998-2004","YY公司");

        Resume xiaohua = xiaoming.clone();
        xiaohua.SetWorkExperience("1998-2005","ZZ公司");


        xiaoming.display();
        xiaohong.display();
        xiaohua.display();
    }
}
