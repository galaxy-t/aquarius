package com.galaxyt.aquarius.proxy.reflect;


import java.lang.reflect.Proxy;

/**
 * 通过反射方式添加代理
 * @author zhouqi
 * @date 2019-07-01 11:22
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 11:22     zhouqi          v1.0.0           Created
 *
 */
public class Client {


    public static void main(String[] args) {
        //真实对象
        Dog dog = new RiceBall();

        //处理程序
        DogInvocationHandler myInvocationHandler = new DogInvocationHandler(dog);

        //代理对象
        //通过反射得出这个代理对象
        //通过 Proxy 生成的代理类对象都要指定对应的处理器对象。
        Dog proxyDog = (Dog) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Dog.class}, myInvocationHandler);


        //Dog dog1=(Dog) Proxy.newProxyInstance(dog.getClass().getClassLoader(),dog.getClass().getInterfaces(), myInvocationHandler);


        //执行代理对象的方法即可将其方法进行环绕
        //其中可以在方法执行前后环绕，出现异常时等场景
        //本质上代理其实就是不改变具体对象方法的执行过程，仅在其执行前后追加操作
        proxyDog.drink();
        proxyDog.eat();
    }

}
