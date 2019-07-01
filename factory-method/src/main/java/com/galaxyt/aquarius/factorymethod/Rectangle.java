package com.galaxyt.aquarius.factorymethod;

/**
 * 矩形
 * 用于表示一种具体的产品
 * @author zhouqi
 * @date 2019-06-28 10:12
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 10:12     zhouqi          v1.0.0           Created
 *
 */
public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
