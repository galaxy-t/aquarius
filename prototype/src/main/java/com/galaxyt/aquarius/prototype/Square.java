package com.galaxyt.aquarius.prototype;

/**
 * 正方形
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
public class Square extends Shape {
    public Square(){
        type = "正方形";
    }

    @Override
    public void draw() {
        System.out.println("正方形 draw()");
    }
}
