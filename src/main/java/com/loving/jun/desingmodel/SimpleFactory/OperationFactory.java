package com.loving.jun.desingmodel.SimpleFactory;

/**
 * 计算工厂类
 * @Author: yijunjun
 * @Date: 2022/4/8 20:57
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null;
        // 同理可得其他操作类
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return  oper;
    }
}
