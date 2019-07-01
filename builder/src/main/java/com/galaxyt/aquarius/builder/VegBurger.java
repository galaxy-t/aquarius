package com.galaxyt.aquarius.builder;

/**
 * 蔬菜汉堡
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
public class VegBurger extends Burger {

    /**
     * 蔬菜汉堡的价格
     * @return
     */
    public float price() {
        return 25.0f;
    }

    /**
     * 蔬菜汉堡的名称
     * @return
     */
    public String name() {
        return "蔬菜汉堡";
    }
}