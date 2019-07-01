package com.galaxyt.aquarius.builder;

/**
 * 汉堡
 * 实现 Item 接口的抽象类，该类提供了默认的功能。
 * @author zhouqi
 * @date 2019-06-28 14:04
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:04     zhouqi          v1.0.0           Created
 *
 */
public abstract class Burger implements Item {

    /**
     * 默认汉堡的包装使用包装纸
     * @return
     */
    public Packing packing() {
        return new Wrapper();
    }

}
