package com.galaxyt.aquarius.builder;

/**
 * 素餐构造器
 * @author zhouqi
 * @date 2019-06-28 14:36
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:36     zhouqi          v1.0.0           Created
 *
 */
public class VegMealBuilder extends MealBuilder {

    /**
     * 为素餐设置蔬菜汉堡
     */
    public void buildBurger() {
        super.meal.addItem(new VegBurger());
    }

    /**
     * 为素餐设置可乐
     */
    public void buildDrink() {
        super.meal.addItem(new Coke());

    }
}
