# 抽象工厂模式

### 定义

    提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
    
    
### 解释

    针对于整个项目现有的功能条件进行设计
    将全部的产品类型进行抽象
    将工场类进行抽象，抽象工场中根据现有的产品类型提供工场的抽象类
    针对不同的产品实现创建不同的工场
    
### 与工厂模式比较

    工厂模式：为每一类产品提供一个工场抽象类，为每一种产品提供一个工场实现类
    抽象工场模式：将产品抽象类分组，为每一组提供一个抽象工场类，为每一组提供一个抽象工厂实现类，其中用于实现该工场需要生产的何种商品
    
    
    工场模式：针对的是具体产品
    抽象工场模式：针对的是产品类型分组
    
### 优点

    当一个产品族中的多个对象被设计成一起工作时，
    它能保证客户端始终只使用同一个产品族中的对象。
    
### 缺点

    产品族扩展非常困难，要增加一个系列的某一产品，
    既要在抽象的 Creator 里加代码，又要在具体的里面加代码。

### 应用场景

1. QQ 换皮肤，一整套一起换。 

2. 生成不同操作系统的程序。
    
### 实例
    
    以生产鼠标键盘耳麦为例
    
    