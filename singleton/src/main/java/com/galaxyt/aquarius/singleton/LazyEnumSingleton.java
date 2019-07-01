package com.galaxyt.aquarius.singleton;

/**
 * 枚举方式  懒汉模式
 * @author zhouqi
 * @date 2019-06-27 17:22
 * @version v1.0.0
 * @Description
 *  天然线程安全，可防止反射生成实例。
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 17:22     zhouqi          v1.0.0           Created
 *
 */
public enum LazyEnumSingleton {

    /**
     * 枚举中的类型默认使用static final修改
     * 且仅当首次调用的时候被实例化一次
     * jvm来保证线程安全
     */
    INSTANCE;

    /**
     * 分号  ;  后面的代码（变量，方法）会被枚举类中的每一个枚举类型携带一份
     * 本枚举中仅存在一个枚举类型，所以可被视为单例模式
     */
    public void toDo() {
        System.out.println("需要实现的代码，也可以有多个方法");
    }


}
