package com.galaxyt.aquarius.proxy.reflect;

/**
 * 饭团，它是一只萨摩耶
 * 后来它丢了
 * @author zhouqi
 * @date 2019-07-01 10:53
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 10:53     zhouqi          v1.0.0           Created
 *
 */
public class RiceBall implements Dog {
    public int drink() {

        System.out.println("饭团正在喝水");

        return 3;
    }

    public String eat() {

        System.out.println("饭团正在吃饭");

        return "狗粮";
    }
}
