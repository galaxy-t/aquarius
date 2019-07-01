# 宝瓶座

## 六大设计原则

### 1.单一职责
    
    一个类，只有一个引起它变化的原因。应该只有一个职责。
    每一个职责都是变化的一个轴线，如果一个类有一个以上的职责，这些职责就耦合在了一起。这会导致脆弱的设计。
    当一个职责发生变化时，可能会影响其它的职责。另外，多个职责耦合在一起，会影响复用性。

1. 一个类，只有一个引起它变化的原因

    > 一个类只负责一项职责。
    
    > 每一个职责都是变化的一个轴线，如果一个类有一个以上的职责，这些职责就耦合在了一起。
    
    > 这会导致脆弱的设计，当一个职责发生变化时，可能会影响其它的职责。
    
    > 多个职责耦合在一起，会影响复用性。
    
2. 职责扩散，因为某种原因，职责P被分化为粒度更细的职责P1和P2

    > 在职责扩散到我们无法控制的程度之前，立刻对代码进行重构。
    
    > 只有逻辑足够简单，才可以在代码级别上违反单一职责原则。
    
    > 只有类中方法数量足够少，才可以在方法级别上违反单一职责原则。
    
3. 遵循单一职责原的优点

    > 可以降低类的复杂度，一个类只负责一项职责，其逻辑肯定要比负责多项职责简单的多；
    
    > 提高类的可读性，提高系统的可维护性；
    
    > 变更引起的风险降低，变更是必然的，如果单一职责原则遵守的好，当修改一个功能时，可以显著降低对其他功能的影响。
    
### 2. 里氏代换原则 （Liskov Substitution Principle LSP）

    任何基类可以出现的地方，子类一定可以出现。 
    LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，
    而衍生类也能够在基类的基础上增加新的行为。

1. 任何基类可以出现的地方，子类一定可以出现。 

    > 如果对每一个类型为 T1的对象 o1，都有类型为 T2 的对象o2，使得以 T1定义的所有程序 P 在所有的对象 o1 都代换成 o2 时，程序 P 的行为没有发生变化，那么类型 T2 是类型 T1 的子类型。

2. 所有引用基类的地方必须能透明地使用其子类的对象。

    > 子类可以扩展父类的功能，但不能改变父类原有的功能。
    
    > 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
    
    > 子类中可以增加自己特有的方法。
    
    > 当子类的方法重载父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松。【注意区分重载和重写】
    
    > 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格。
    
### 3. 依赖倒置原则 （Dependence Inversion Principle）
    
    依赖于抽象，不要依赖于具体。实现开闭原则的关键是抽象化，并且从抽象化导出具体化实现，如果说开闭原则是面向对象设计的目标的话，那么依赖倒转原则就是面向对象设计的主要手段。
    定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。
    要求对抽象进行编程，不要对实现进行编程，这样就降低了客户与实现模块间的耦合。
    
1. 低层模块尽量都要有抽象类或接口，或者两者都有。【可能会被人用到的】

    > 使用接口或者抽象类的目的是制定好规范和契约，而不去涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。
    
2. 变量的声明类型尽量是抽象类或接口。
    
    > 依赖倒置原则的核心就是要我们面向接口编程，理解了面向接口编程，也就理解了依赖倒置。

3. 使用继承时遵循里氏替换原则。

### 4. 接口隔离原则 （Interface Segregation Principle）

    使用多个隔离的接口，比使用单个接口要好。
    客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。 
    类A通过接口I依赖类B，类C通过接口I依赖类D，如果接口I对于类A和类B来说不是最小接口，则类B和类D必须去实现他们不需要的方法。
    将臃肿的接口I拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则。
    
1. 建立单一接口，不要建立庞大臃肿的接口，尽量细化接口，接口中的方法尽量少。
    
    > 接口尽量小，但是要有限度。对接口进行细化可以提高程序设计灵活性是不挣的事实，但是如果过小，则会造成接口数量过多，使设计复杂化。所以一定要适度。
    
    > 为依赖接口的类定制服务，只暴露给调用的类它需要的方法，它不需要的方法则隐藏起来。只有专注地为一个模块提供定制服务，才能建立最小的依赖关系。
    
    > 提高内聚，减少对外交互。使接口用最少的方法去完成最多的事情。
    
### 5. 迪米特法则（最少知道原则） （Demeter Principle）
    
    一个对象应该对其他对象保持最少的了解。
    一个类对自己依赖的类知道的越少越好。也就是说，对于被依赖的类来说，无论逻辑多么复杂，都尽量地的将逻辑封装在类的内部，对外除了提供的public方法，不对外泄漏任何信息。
    类与类之间的关系越密切，耦合度越大，当一个类发生改变时，对另一个类的影响也越大。
    尽量降低类与类之间的耦合。
    
### 6. 开闭原则（Open Close Principle）

    对扩展开放，对修改关闭。
    为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，需要面向接口编程。
    一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。

1. 用抽象构建框架，用实现扩展细节。

    > 抽象灵活性好，适应性广，只要抽象的合理，可以基本保持软件架构的稳定。
    
    > 软件中易变的细节，用从抽象派生的实现类来进行扩展，当软件需要发生变化时，我们只需要根据需求重新派生一个实现类来扩展。
    
    > 抽象要合理，要对需求的变更有前瞻性和预见性。
    
### 总结

* 用抽象构建框架，用实现扩展细节

    > 单一职责原则告诉我们实现类要职责单一；
    
    > 里氏替换原则告诉我们不要破坏继承体系；
    
    > 依赖倒置原则告诉我们要面向接口编程；
    
    > 接口隔离原则告诉我们在设计接口的时候要精简单一；
    
    > 迪米特法则告诉我们要降低耦合。
    
    > 而开闭原则是总纲，他告诉我们要对扩展开放，对修改关闭。
    
    
**参考资料:[JAVA设计模式总结之六大设计原则](https://www.cnblogs.com/pony1223/p/7594803.html)**
    

**********




## 23种设计模式（Design pattern）

    设计模式（Design pattern）是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。
    使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性。
    
### 1. 设计模式的三个分类

1. 创建型模式(对象实例化的模式，创建型模式用于解耦对象的实例化过程。)

    > 这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，
    而不是使用 new 运算符直接实例化对象。
    这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

    > 单例模式：某个类只能有一个实例，提供一个全局的访问点。 （Singleton Pattern）
    
    > 工厂模式：一个工厂类根据传入的参量决定创建出那一种产品类的实例。 （Factory Pattern）
    
    > 抽象工厂：创建相关或依赖对象的家族，而无需明确指定具体类。 （Abstract Factory Pattern）
    
    > 建造者模式：封装一个复杂对象的构建过程，并可以按步骤构造。 （Builder Pattern）
    
    > 原型模式：通过复制现有的实例来创建新的实例。 （Prototype Pattern）
    
    > 简单工厂：定义一个创建对象的接口，让子类决定实例化哪个类。(Static Factory Method)（不属于23种设计模式）
    
2. 结构型模式(把类或对象结合在一起形成一个更大的结构。)

    > 这些设计模式关注类和对象的组合。
    继承的概念被用来组合接口和定义组合对象获得新功能的方式。

    > 适配器模式：将一个类的方法接口转换成客户希望的另外一个接口。（Adapter Pattern）
    
    > 组合模式：将对象组合成树形结构以表示“”部分-整体“”的层次结构。（Composite Pattern）
    
    > 装饰器模式：动态的给对象添加新的功能。 （Decorator Pattern）
    
    > 代理模式：为其他对象提供一个代理以便控制这个对象的访问。（Proxy Pattern）
    
    > 亨元（蝇量）模式：通过共享技术来有效的支持大量细粒度的对象。（Flyweight Pattern）
    
    > 外观模式：对外提供一个统一的方法，来访问子系统中的一群接口。（Facade Pattern）
    
    > 桥接模式：将抽象部分和它的实现部分分离，使它们都可以独立的变化。（Bridge Pattern）
    
    > 过滤器模式（Filter、Criteria Pattern）

3. 行为型模式(类和对象如何交互，及划分责任和算法。)

    > 这些设计模式特别关注对象之间的通信。

    *> 模板模式：定义一个算法结构，而将一些步骤延迟到子类实现。（Template Pattern）
    
    > 解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器。（Interpreter Pattern）
    
    *> 策略模式：定义一系列算法，把他们封装起来，并且使它们可以相互替换。（Strategy Pattern）
    
    *> 状态模式：允许一个对象在其对象内部状态改变时改变它的行为。（State Pattern）
    
    *> 观察者模式：对象间的一对多的依赖关系。（Observer Pattern）
    
    > 备忘录模式：在不破坏封装的前提下，保持对象的内部状态。（Memento Pattern）
    
    > 中介者模式：用一个中介对象来封装一系列的对象交互。（Mediator Pattern）
    
    > 命令模式：将命令请求封装为一个对象，使得可以用不同的请求来进行参数化。（Command Pattern）
    
    *> 访问者模式：在不改变数据结构的前提下，增加作用于一组对象元素的新功能。（Visitor Pattern）
    
    > 责任链模式：将请求的发送者和接收者解耦，使的多个对象都有处理这个请求的机会。（Chain of Responsibility Pattern）
    
    > 迭代器模式：一种遍历访问聚合对象中各个元素的方法，不暴露该对象的内部结构。（Iterator Pattern）
    
    *> **空对象模式（Null Object Pattern）
    
**参考资料:[JAVA设计模式总结之23种设计模式](https://www.cnblogs.com/pony1223/p/7608955.html)**

    

            
        