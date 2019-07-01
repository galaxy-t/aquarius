package com.galaxyt.aquarius.proxy.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 狗的处理器
 * @author zhouqi
 * @date 2019-07-01 10:55
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 10:55     zhouqi          v1.0.0           Created
 *
 */
public class DogInvocationHandler implements InvocationHandler {

    /**
     * 因为需要处理真实的对象
     * 所以要把真实的对象传进来
     */
    private Dog dog;

    public DogInvocationHandler(Dog dog) {
        this.dog = dog;
    }

    /**
     * 调用方法时候触发
     * @param proxy     代理类,被代理出来的那个对象，不能直接使用，可以使用反射得到一些其它的信息
     * @param method    正在调用的方法
     * @param args      方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("正在调用代理类");

        if(method.getName().equals("drink")){
            System.out.println("调用的是喝的方法");
            return method.invoke(dog, args);
        }else {
            System.out.println("调用的是说话的方法");
            return method.invoke(dog,args) ;
        }

    }
}
