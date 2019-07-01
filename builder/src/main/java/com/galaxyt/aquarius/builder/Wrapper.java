package com.galaxyt.aquarius.builder;

/**
 * 包装纸
 * 实现 Packing 接口的实体类
 * @author zhouqi
 * @date 2019-06-28 14:02
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:02     zhouqi          v1.0.0           Created
 *
 */
public class Wrapper implements Packing {

    /**
     * 包装纸名称
     * @return
     */
    public String pack() {
        return "包装纸";
    }
}
