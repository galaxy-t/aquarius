package com.galaxyt.aquarius.singleton;

/**
 * 懒汉模式，同步锁
 * @author zhouqi
 * @date 2019-06-27 16:59
 * @version v1.0.0
 * @Description
 *  优点：线程安全
 *  缺点：每次获取实例都要加锁，耗费资源，其实只要实例已经生成，以后获取就不需要再锁了
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 16:59     zhouqi          v1.0.0           Created
 *
 */
public class LazyLockSingleton {

    /**
     * 私有的静态变量，程序启动不会被初始化
     */
    private static LazyLockSingleton singleton = null;

    /**
     * 私有的构造函数，保证不被外部实例化
     */
    private LazyLockSingleton() {

        //TODO 此处可以针对该对象进行一些初始化操作

    }

    /**
     * 为外部提供获取实例对象的公共静态方法
     * 线程安全，保证仅有一个线程操作本方法
     * 为该方法加锁会大大影响效率
     * @return  返回这个单例对象的实例
     */
    public synchronized static LazyLockSingleton getInstance() {

        /*
        如果单例对象未被初始化那么为他进行初始化
         */
        if (singleton == null) {
            singleton = new LazyLockSingleton();
        }

        return singleton;

    }


}
