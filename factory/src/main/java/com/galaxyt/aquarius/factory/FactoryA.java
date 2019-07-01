package com.galaxyt.aquarius.factory;

/**
 * 具体工场A，生产A类产品
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
public class FactoryA extends Factory {

    public Product manufacture() {
        return new ProductA();
    }

}
