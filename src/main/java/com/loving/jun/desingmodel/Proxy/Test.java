package com.loving.jun.desingmodel.Proxy;

/**
 * @Author: yijunjun
 * @Date: 2022/4/14 22:24
 */
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy("mm");
        proxy.createProxy();
        proxy.GiveChocolate();
    }
}
