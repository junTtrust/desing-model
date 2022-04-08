package com.loving.jun.desingmodel.SimpleFactory;

/**
 * 计算器类
 * @Author: yijunjun
 * @Date: 2022/4/7 23:09
 */
public class Operation {

    // 定义计算两个数
    private double _numberA = 0;
    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public double getResult(){
        double result = 0;
        return result;
    }

}
