package com.loving.jun.desingmodel.SimpleFactor.CalculatorSimpleFactory;

/**
 * 乘法操作类
 * @Author: yijunjun
 * @Date: 2022/4/8 21:06
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if(get_numberB() != 0) {
            result = get_numberA() / get_numberB();
        }
        return result;
    }
}
