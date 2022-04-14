package com.loving.jun.desingmodel.Decorator;

/**
 * ConcreteDecorator（具体装饰类）
 * @Author: yijunjun
 * @Date: 2022/4/14 20:50
 */
public class BlackBorderDecorator extends Decorator{
    public BlackBorderDecorator(Component component)
    {
        super(component);
    }

    public void display()
    {
        addBlackBorder();
        super.display();
    }

    public void addBlackBorder()
    {
        System.out.println("添加黑边框");
    }
}
