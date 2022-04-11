package com.loving.jun.desingmodel.SimpleFactor.CashSimpleFactory;

/**
 * @Author: yijunjun
 * @Date: 2022/4/8 22:05
 */
public class CashReturn implements CashSuper {

    /**
     * 满300减100
     */
    private double moneyCondition = 0.0d;   //300
    private double moneyReturn = 0.0d;      // 100
    
    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return 0;
    }

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }
}
