# 策略模式：
策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合
## 优点：
策略模式的Strategy类层次为Context定义了一系列的可供重用的算法或行为。继承有助于析取出这些算法中的公共功能


### 简单工厂模式 & 策略模式区别

- 用途不一样
  工厂是创建型模式,它的作用就是创建对象；
  策略是行为型模式,它的作用是让一个对象在许多行为中选择一种行为;

- 关注点不一样
  一个关注对象创建
  一个关注行为的封装

-  解决不同的问题
  工厂模式是创建型的设计模式，它接受指令，创建出符合要求的实例；它主要解决的是资源的统一分发，将对象的创建完全独立出来，让对象的创建和具体的使用客户无关。主要应用在多数据库选择，类库文件加载等。
  策略模式是为了解决的是策略的切换与扩展，更简洁的说是定义策略族，分别封装起来，让他们之间可以相互替换，策略模式让策略的变化独立于使用策略的客户