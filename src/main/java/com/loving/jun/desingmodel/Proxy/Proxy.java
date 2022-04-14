package com.loving.jun.desingmodel.Proxy;

/**
 * @Author: yijunjun
 * @Date: 2022/4/14 22:22
 */
public class Proxy implements  IGiveGift {

    String mm;
    private  Pursuit pursuit;

    public Proxy(String mm){
        this.mm = mm;
    }
    @Override
    public void GiveDools() {
        pursuit.GiveDools();
    }

    @Override
    public void GiveFlows() {
        pursuit.GiveFlows();
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
    }

    public void createProxy(){
        if(pursuit == null){
            this.pursuit = new Pursuit(mm);
        }
    }
}
