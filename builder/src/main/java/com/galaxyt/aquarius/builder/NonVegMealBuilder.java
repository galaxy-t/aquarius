package com.galaxyt.aquarius.builder;

/**
 * 非素食构造器
 * @author zhouqi
 * @date 2019-06-28 14:39
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:39     zhouqi          v1.0.0           Created
 *
 */
public class NonVegMealBuilder extends MealBuilder {

    /**
     * 为非素餐设置鸡肉汉堡
     */
    public void buildBurger() {
        super.meal.addItem(new ChickenBurger());

    }

    /**
     * 为非素餐设置百事
     */
    public void buildDrink() {
        super.meal.addItem(new Pepsi());
    }
}
