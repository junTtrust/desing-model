package com.loving.jun.desingmodel.Decorator;

/**
 * Decorator（抽象装饰类）
 * @Author: yijunjun
 * @Date: 2022/4/14 20:48
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component)
    {
        this.component = component;
    }

    public void display()
    {
        component.display();
    }
}
