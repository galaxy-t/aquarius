package com.galaxyt.aquarius.prototype;

/**
 * 定义图形的抽象类
 * @author zhouqi
 * @date 2019-06-28 15:25
 * @version v1.0.0
 * @Description
 * 必须实现 Cloneable 接口
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 15:25     zhouqi          v1.0.0           Created
 * 与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。
 * 浅拷贝实现 Cloneable，重写clone方法，
 * 深拷贝是通过实现 Serializable 读取二进制流。
 */
public abstract class Shape implements Cloneable {



    private String id;

    /**
     * 图形名称
     */
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * 必须重写clone方法
     * @return
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
