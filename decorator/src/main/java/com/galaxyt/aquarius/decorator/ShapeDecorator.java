package com.galaxyt.aquarius.decorator;

/**
 * 图形装饰器抽象类
 * @author zhouqi
 * @date 2019-07-01 10:14
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 10:14     zhouqi          v1.0.0           Created
 *
 */
public abstract class ShapeDecorator implements Shape {

    /**
     * 被装饰的图形
     */
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    /**
     * 实现接口的方法，默认情况下
     */
    public void draw(){
        decoratedShape.draw();
    }

}
