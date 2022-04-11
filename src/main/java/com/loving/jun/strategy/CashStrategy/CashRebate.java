package com.loving.jun.strategy.CashStrategy;

/**
 * 打折收费子类
 * @Author: yijunjun
 * @Date: 2022/4/8 21:53
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1;
    @Override
    public double acceptCash(double money) {
        return moneyRebate * money;
    }

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
}
