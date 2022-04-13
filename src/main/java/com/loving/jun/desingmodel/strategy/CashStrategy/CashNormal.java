package com.loving.jun.desingmodel.strategy.CashStrategy;

/**
 * 正常收费子类
 * @Author: yijunjun
 * @Date: 2022/4/8 21:51
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
