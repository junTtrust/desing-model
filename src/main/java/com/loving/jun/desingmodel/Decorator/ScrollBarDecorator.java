package com.loving.jun.desingmodel.Decorator;

/**
 * ConcreteDecorator（具体装饰类）
 * @Author: yijunjun
 * @Date: 2022/4/14 20:49
 */
public class ScrollBarDecorator extends Decorator {
    public ScrollBarDecorator(Component component)
    {
        super(component);
    }

    public void display()
    {
        addScrollBar();
        super.display();
    }

    public void addScrollBar()
    {
        System.out.println("添加滚动条");
    }
}
