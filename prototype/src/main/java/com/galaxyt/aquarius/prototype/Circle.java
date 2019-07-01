package com.galaxyt.aquarius.prototype;

/**
 * 圆
 * @author zhouqi
 * @date 2019-06-28 15:28
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 15:28     zhouqi          v1.0.0           Created
 *
 */
public class Circle extends Shape{


    public Circle(){
        type = "圆形";
    }

    /**
     * 实现画的方法
     */
    @Override
    public void draw() {
        System.out.println("圆形 draw()");
    }
    
}
