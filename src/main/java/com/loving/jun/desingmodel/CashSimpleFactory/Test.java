package com.loving.jun.desingmodel.CashSimpleFactory;

/**
 * @Author: yijunjun
 * @Date: 2022/4/8 22:23
 */
public class Test {
    public static void main(String[] args) {
        CashSuper cashRabate = CashFactory.createCashAccept("打8折");
        double result = cashRabate.acceptCash(100);
        System.out.println(result);
    }
}
