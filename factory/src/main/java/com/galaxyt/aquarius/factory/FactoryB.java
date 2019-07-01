package com.galaxyt.aquarius.factory;

/**
 * 具体工场B，生产B类产品
 * @author zhouqi
 * @date 2019-06-27 18:00
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 18:00     zhouqi          v1.0.0           Created
 *
 */
public class FactoryB extends Factory {
    public Product manufacture() {
        return new ProductB();
    }
}
