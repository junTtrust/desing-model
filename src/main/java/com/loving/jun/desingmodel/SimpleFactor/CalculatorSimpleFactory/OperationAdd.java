package com.loving.jun.desingmodel.SimpleFactor.CalculatorSimpleFactory;

/**
 * 加法操作类，同理可得减法，乘法，除法操作类
 * @Author: yijunjun
 * @Date: 2022/4/8 20:53
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = get_numberA() + get_numberB();
        return result;
    }
}
