package com.loving.jun.strategy.CashStrategy;

/**
 * @Author: yijunjun
 * @Date: 2022/4/11 21:07
 */
public class CashContext {
    CashSuper cs = null;

    /**
     * 这个方法结合了工厂模式
     * @param type
     */
    public CashContext (String type){
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn("300","100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
        }
    }

    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
