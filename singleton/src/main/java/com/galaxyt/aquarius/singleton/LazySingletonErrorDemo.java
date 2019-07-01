package com.galaxyt.aquarius.singleton;


/**
 * 懒汉模式，错误演示1
 * @author zhouqi
 * @date 2019-06-27 16:48
 * @version v1.0.0
 * @Description
 *
 * 优点：在获取实例的方法中，进行实例的初始化，节省系统资源
 * 缺点：
 *      1.如果获取实例时，初始化工作较多，加载速度会变慢，影响系统系能
 *      2.每次获取实例都要进行非空检查，系统开销大
 *      3.非线程安全，当多个线程同时访问getInstance()时，可能会产生多个实例
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 16:48     zhouqi          v1.0.0           Created
 *
 */
public class LazySingletonErrorDemo {

    /**
     * 私有的静态变量，程序启动不会被初始化
     */
    private static LazySingletonErrorDemo singleton = null;

    /**
     * 私有的构造函数，保证不被外部实例化
     */
    private LazySingletonErrorDemo() {

        //TODO 此处可以针对该对象进行一些初始化操作

    }

    /**
     * 为外部提供获取实例对象的公共静态方法
     * 本方法不能保证线程安全，同理也不能保证singleton对象仅被初始化一次
     * 若存在多个线程同时调用本方法时，可能会创建多个实例，但最终结果只会有一个，因为只定义了一个静态的singleton变量
     * @return  返回这个单例对象的实例
     */
    public static LazySingletonErrorDemo getInstance() {

        /*
        如果单例对象未被初始化那么为他进行初始化
         */
        if (singleton == null) {
            singleton = new LazySingletonErrorDemo();
        }

        return singleton;

    }


}
