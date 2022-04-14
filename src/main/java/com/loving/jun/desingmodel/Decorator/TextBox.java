package com.loving.jun.desingmodel.Decorator;

/**
 * 具体构建类（ConcreteComponent）
 * @Author: yijunjun
 * @Date: 2022/4/14 20:45
 */
public class TextBox extends Component{
    public void display()
    {
        System.out.println("显示文本框");
    }
}
