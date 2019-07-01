package com.galaxyt.aquarius.singleton;

/**
 * 饿汉模式
 * @author zhouqi
 * @date 2019-06-27 16:42
 * @version v1.0.0
 * @Description
 *  1.声明静态私有类变量，且立即实例化，保证实例化一次
 *  2.私有构造，防止外部实例化（通过反射是可以实例化的，不考虑此种情况）
 *  3.提供public的getInstance（）方法供外部获取单例实例
 *
 *  优点：线程安全，获取实例速度快
 *  缺点：类加载即初始化实例，内存浪费
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 16:42     zhouqi          v1.0.0           Created
 *
 */
public class HungrySingleton {

    /**
     * 私有静态变量，程序启动时被初始化，也仅初始化一次
     */
    private static final HungrySingleton singleton = new HungrySingleton();


    /**
     * 私有的构造函数，保证不被外部实例化
     */
    private HungrySingleton() {

        //TODO 此处可以针对该对象进行一些初始化操作

    }

    /**
     * 为外部提供获取实例对象的公共静态方法
     * @return  返回这个单例对象的实例
     */
    public static HungrySingleton getInstance() {
        return singleton;
    }


}
