package com.loving.jun.desingmodel.TemplateMethod;

/**
 * @Author: yijunjun
 * @Date: 2022/4/16 16:21
 */
public class Test {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.templateMethod();
    }
}
