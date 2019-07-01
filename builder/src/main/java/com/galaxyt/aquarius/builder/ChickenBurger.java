package com.galaxyt.aquarius.builder;

/**
 * 鸡肉汉堡
 * 扩展了 Burger 的实体类。
 * @author zhouqi
 * @date 2019-06-28 14:06
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:06     zhouqi          v1.0.0           Created
 *
 */
public class ChickenBurger extends Burger {

    /**
     * 鸡肉汉堡的架构
     * @return
     */
    public float price() {
        return 50.5f;
    }

    /**
     * 鸡肉汉堡的名称
     * @return
     */
    public String name() {
        return "鸡肉汉堡";
    }
}
