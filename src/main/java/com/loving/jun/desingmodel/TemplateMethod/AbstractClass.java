package com.loving.jun.desingmodel.TemplateMethod;

/**
 * 抽象类
 * @Author: yijunjun
 * @Date: 2022/4/16 16:17
 */
abstract class AbstractClass{

    // 模板方法
    // 定义了算法的骨架，按某种顺序调用其包含的基本方法
    public void templateMethod(){
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    //抽象方法1
    public abstract void abstractMethod1();
    //抽象方法2
    public abstract void abstractMethod2();
}
