package com.galaxyt.aquarius.singleton;

/**
 * 懒汉模式 静态内部类方式
 * @author zhouqi
 * @date 2019-06-27 17:08
 * @version v1.0.0
 * @Description
 *  优点：既避免了同步带来的性能损耗，又能够延迟加载
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 17:08     zhouqi          v1.0.0           Created
 *
 */
public class LazyStaticInnerClassSingleton {


    /**
     * 私有静态变量，程序启动时被初始化，也仅初始化一次
     */
    private LazyStaticInnerClassSingleton() {

    }


    /**
     * 静态内部类
     * 静态内部类中的静态变量会在首次被调用的时候初始化一次
     */
    private static class SingletonHolder {

        /*
        在被首次调用的时候仅会初始化一次
         */
        private static final LazyStaticInnerClassSingleton singleton = new LazyStaticInnerClassSingleton();

    }

    /**
     * 为外部提供获取实例对象的公共静态方法
     * @return  返回这个单例对象的实例
     */
    public static LazyStaticInnerClassSingleton getInstance() {

        return SingletonHolder.singleton;

    }


}
