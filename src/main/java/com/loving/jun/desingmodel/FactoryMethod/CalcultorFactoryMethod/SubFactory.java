package com.loving.jun.desingmodel.FactoryMethod.CalcultorFactoryMethod;

/**
 * 减法工厂类
 * @Author: yijunjun
 * @Date: 2022/4/15 10:40
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
