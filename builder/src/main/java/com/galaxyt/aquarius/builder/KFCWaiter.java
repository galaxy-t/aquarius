package com.galaxyt.aquarius.builder;

/**
 * KFC服务员
 * Director（指挥者）
 * @author zhouqi
 * @date 2019-06-28 14:41
 * @version v1.0.0
 * @Description
 *  构建一个使用Builder接口的对象。
 *  它主要是用于创建一个复杂的对象，
 *  它主要有两个作用，
 *  一是：隔离了客户与对象的生产过程，
 *  二是：负责控制产品对象的生产过程。
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:41     zhouqi          v1.0.0           Created
 *
 */
public class KFCWaiter {


    /**
     * 建造器变量
     */
    private MealBuilder mealBuilder;

    /**
     * 通过构造函数设置建造器
     * @param mealBuilder
     */
    public KFCWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }


    /**
     * 膳食制造的流程控制
     * @return
     */
    public Meal construct(){
        //准备食物
        mealBuilder.buildBurger();
        //准备饮料
        mealBuilder.buildDrink();

        //准备完毕，返回一个完整的套餐给客户
        return mealBuilder.getMeal();
    }

}
