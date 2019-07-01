package com.galaxyt.aquarius.builder;

/**
 * 冷饮
 * 实现 Item 接口的抽象类，该类提供了默认的功能。
 * @author zhouqi
 * @date 2019-06-28 14:05
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:05     zhouqi          v1.0.0           Created
 *
 */
public abstract class ColdDrink implements Item {

    /**
     * 默认冷饮的包装使用包装盒
     * @return
     */
    public Packing packing() {
        return new Bottle();
    }

}
