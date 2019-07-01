package com.galaxyt.aquarius.factorymethod;

/**
 * 圆
 * 用于表示一种具体的产品
 * @author zhouqi
 * @date 2019-06-28 10:13
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 10:13     zhouqi          v1.0.0           Created
 *
 */
public class Circle implements Shape {
    
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    
}
