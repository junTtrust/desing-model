package com.loving.jun.desingmodel.FactoryMethod.CalcultorFactoryMethod;

/**
 * @Author: yijunjun
 * @Date: 2022/4/15 10:42
 */
public class Test {
    public static void main(String[] args) {
        AddFactory addFactory = new AddFactory();
        Operation operation = addFactory.createOperation();
        operation.set_numberA(1);
        operation.set_numberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
