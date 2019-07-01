package com.galaxyt.aquarius.builder;

/**
 * 构造器抽象类
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
public abstract class MealBuilder {


    /**
     * 一个构造器对应一份膳食套餐
     */
    protected Meal meal = new Meal();

    /**
     * 设置汉堡
     */
    public abstract void buildBurger();

    /**
     * 设置饮料
     */
    public abstract void buildDrink();

    /**
     * 通过构造器得到构造出来的膳食
     * @return
     */
    public Meal getMeal() {
        return meal;
    }
}
