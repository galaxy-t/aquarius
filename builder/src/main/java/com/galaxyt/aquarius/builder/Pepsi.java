package com.galaxyt.aquarius.builder;

/**
 * 百事可乐
 * 扩展了 ColdDrink 的实体类。
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
public class Pepsi extends ColdDrink {

    /**
     * 百事的价格
     * @return
     */
    public float price() {
        return 35.0f;
    }

    /**
     * 百事的名称
     * @return
     */
    public String name() {
        return "百事";
    }
}
