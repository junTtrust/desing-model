package com.loving.jun.desingmodel.Decorator;

/**
 * @Author: yijunjun
 * @Date: 2022/4/14 20:51
 */
public class Test {
    public static void main(String[] args) {
        Component component = new Window();
        Component decorator = new ScrollBarDecorator(component);
        decorator.display();
        System.out.println("--------------------------------");
        ListBox listBox = new ListBox();
        BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(listBox);
        blackBorderDecorator.display();
    }
}
