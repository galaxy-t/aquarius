package com.galaxyt.aquarius.builder;

/**
 * 包装盒
 * 实现 Packing 接口的实体类
 * @author zhouqi
 * @date 2019-06-28 14:03
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:03     zhouqi          v1.0.0           Created
 *
 */
public class Bottle implements Packing {

    /**
     * 包装盒的名称
     * @return
     */
    public String pack() {
        return "包装盒";
    }
}
