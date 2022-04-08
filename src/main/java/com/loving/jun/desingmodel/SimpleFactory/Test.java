package com.loving.jun.desingmodel.SimpleFactory;

/**
 * @Author: yijunjun
 * @Date: 2022/4/8 20:59
 */
public class Test {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("/");
        operate.set_numberA(1.2);
        operate.set_numberB(1.2);
        double result = operate.getResult();
        System.out.println(result);
    }
}
