package com.galaxyt.aquarius.decorator;

/**
 * 图形装饰器实现类
 * @author zhouqi
 * @date 2019-07-01 10:16
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 10:16     zhouqi          v1.0.0           Created
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

    /**
     * 加载具体图形
     * @param decoratedShape
     */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    /**
     * 重写画的方法
     * 调用新的功能
     */
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 新增的功能
     * @param decoratedShape
     */
    private void setRedBorder(Shape decoratedShape){
        System.out.println("红色");
    }
}
