package com.galaxyt.aquarius.prototype;

import java.util.Hashtable;

/**
 * 图形实例缓存类
 * @author zhouqi
 * @date 2019-06-28 15:32
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 15:32     zhouqi          v1.0.0           Created
 *
 */
public class ShapeCache {

    /**
     * 用户存储复制出来的图形对象
     * 线程安全
     * key   图形的ID
     * value 图形的对象
     */
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    /**
     * 根据图形ID获取对象
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        //先从hashtable中得到对象原型
        Shape cachedShape = shapeMap.get(shapeId);
        //再调用原型对象的克隆方法将其克隆一份返回
        return (Shape) cachedShape.clone();
    }


    /**
     * 将每种图形进行创建并缓存，实际操作过程中可查询数据库得到并创建这些对象
     */
    public static void loadCache() {


        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }


}
