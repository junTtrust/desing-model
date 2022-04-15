package com.loving.jun.desingmodel.FactoryMethod.CalcultorFactoryMethod;

/**
 * 乘法工厂类
 * @Author: yijunjun
 * @Date: 2022/4/15 10:40
 */
public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
