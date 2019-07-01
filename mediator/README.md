# 中介者模式

    用来降低多个对象和类之间的通信复杂性
    
    提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
    
    用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
    从而使其耦合松散，而且可以独立地改变它们之间的交互。


### 优点

1. 降低了类的复杂度，将一对多转化成了一对一。 

2. 各个类之间的解耦。 

3. 符合迪米特原则。
    
### 缺点
    
    中介者会庞大，变得复杂难以维护。       