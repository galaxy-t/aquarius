# 组合模式

    组合模式（Composite Pattern），又叫部分整体模式，
    是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，
    用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
    
    这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

### 描述

    1、组合模式，就是在一个对象中包含其他对象，
      这些被包含的对象可能是终点对象（不再包含别的对象），
      也有可能是非终点对象（其内部还包含其他对象，或叫组对象），
      我们将对象称为节点，即一个根节点包含许多子节点，这些子节点有的不再包含子节点，
      而有的仍然包含子节点，以此类推。
    
    2、所谓组合模式，其实说的是对象包含对象的问题，
      通过组合的方式（在对象内部引用对象）来进行布局，我认为这种组合是区别于继承的，
      而另一层含义是指树形结构子节点的抽象（将叶子节点与数枝节点抽象为子节点），
      区别于普通的分别定义叶子节点与数枝节点的方式。
      
### 理解

    其实是关联关系的一种，Java中有以下四种关系
    
1. 依赖(Dependency)
    
    > 类与类之间的联接
    
    > 表示一个类依赖于另一个类的定义
    
    > 依赖关系在Java语言中体现为局域变量、方法的形参，或者对静态方法的调用。 

2. 关联(Association）

    > 类与类之间的联接
    
    > 一个类知道另一个类的属性和方法
    
    > 关联可以是双向的，也可以是单向的
    
    > 关联关系一般使用成员变量来实现

3. 聚合(Aggregation) 

    > 关联关系的一种，是强的关联关系
    
    > 聚合是整体和个体之间的关系
    
    > 通过实例变量实现的
    
    > 关联关系所涉及的两个类是处在同一层次上的，而在聚合关系中，两个类是处在不平等层次上的，
      一个代表整体，另一个代表部分。

4. 组合(Composition) 

    > 关联关系的一种
    
    > 比聚合关系强的关系
    
    > 要求普通的聚合关系中代表整体的对象负责代表部分对象的生命周期，组合关系是不能共享的。