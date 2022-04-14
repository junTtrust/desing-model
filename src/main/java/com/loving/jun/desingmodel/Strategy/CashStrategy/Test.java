package com.loving.jun.desingmodel.Strategy.CashStrategy;

/**
 * @Author: yijunjun
 * @Date: 2022/4/11 21:15
 */
public class Test {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("满300减100");
        double v = cashContext.GetResult(100D);
        System.out.println(v);
    }
}
