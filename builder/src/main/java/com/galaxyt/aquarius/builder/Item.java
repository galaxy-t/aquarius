package com.galaxyt.aquarius.builder;

/**
 * 表示食物条目的接口。
 * 全部食物（汉堡和冷饮）总的接口
 * @author zhouqi
 * @date 2019-06-28 14:01
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:01     zhouqi          v1.0.0           Created
 *
 */
public interface Item {

    /**
     * 返回食物名称
     * @return
     */
    String name();

    /**
     * 返回包装类型
     * @return
     */
    Packing packing();

    /**
     * 返回食物价格
     * @return
     */
    float price();
    
}
