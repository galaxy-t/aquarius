package com.galaxyt.aquarius.singleton;

/**
 * 饿汉模式 双重检查锁
 * @author zhouqi
 * @date 2019-06-27 17:03
 * @version v1.0.0
 * @Description
 * 在第一次调用getInstance方法的时候创建实例
 * 优点：线程安全，进行双重检查，保证只在实例未初始化前进行同步，效率高
 * 缺点：还是实例非空判断，耗费一定资源
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 17:03     zhouqi          v1.0.0           Created
 *
 */
public class LazyDoubleCheckSingleton {

    //1
    //若不加volatile关键字，在多线程并发的情况下会出现问题
    //但是单纯加volatile关键字也是不能够解决问题的，仅能保证该对象被实例化后立刻被内存发现
    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {

    }


    //4
    //最安全的办法是在该方法上加锁
    //但是会影响并发速度
    public static LazyDoubleCheckSingleton getInstance() {

        if (instance == null) {

            //2
            //将初始化方法加锁
            //锁只能保证多线程执行的有序性
            //假如有a,b,c三个线程同时完成了第一个判断进入到此处
            //a线程先拿到锁，然后new了一次
            //b线程又拿到锁，又进行new了一次
            //。。。
            //所以需要在锁内部再进行一次判断
            synchronized (LazyDoubleCheckSingleton.class) {

                //3
                //Double Check
                //双重检查
                //此时才能保证当前代码为懒加载的单例模式
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }

            }


        }

        return instance;
    }



}
