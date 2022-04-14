package com.loving.jun.desingmodel.Strategy.CashStrategy;

/**
 * 现金收费抽象类
 * @Author: yijunjun
 * @Date: 2022/4/8 21:50
 */
public interface CashSuper {

    /**
     * 现金收取
     * @param money 原价
     * @return 当前价格
     */
    public abstract double acceptCash(double money);
}
