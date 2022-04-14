package com.loving.jun.desingmodel.Proxy;

/**
 * @Author: yijunjun
 * @Date: 2022/4/14 22:20
 */
public class Pursuit implements  IGiveGift {

    String mm;

    public Pursuit(String mm){
        this.mm = mm;
    }
    @Override
    public void GiveDools() {
        System.out.println("洋娃娃");
    }

    @Override
    public void GiveFlows() {
        System.out.println("鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("巧克力");
    }
}
