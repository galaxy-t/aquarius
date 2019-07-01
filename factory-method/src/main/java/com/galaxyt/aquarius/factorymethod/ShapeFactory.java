package com.galaxyt.aquarius.factorymethod;

/**
 * 简单工场类
 * 用于生产制造全部图形
 * @author zhouqi
 * @date 2019-06-28 10:43
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 10:43     zhouqi          v1.0.0           Created
 *
 */
public class ShapeFactory {


    /**
     * 使用 getShape 方法获取形状类型的对象
     * @param shapeType 使用字符串指定需要创建哪种具体类型的图形
     *                  该参数可以修改成枚举类型来防止调用者输入错误
     *                  但是不要企图使用反射来实现该方法
     *                  因为工场模式的具体意图在于调用者不需要知道具体的实现类，仅仅知道这些实现类的抽象接口
     *                  若使用反射则需要传入Class或类路径等信息，增加了程序的耦合性
     *                  并且若实现类不存在于本地（存在于Internet上等）的时候是无法获得Class等信息的
     * @return
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

}
