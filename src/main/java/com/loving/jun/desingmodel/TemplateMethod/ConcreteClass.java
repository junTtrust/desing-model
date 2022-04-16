package com.loving.jun.desingmodel.TemplateMethod;

/**
 * @Author: yijunjun
 * @Date: 2022/4/16 16:20
 */
public class ConcreteClass extends AbstractClass{

    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
