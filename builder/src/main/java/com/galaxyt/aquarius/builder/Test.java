package com.galaxyt.aquarius.builder;

public class Test {

    public static void main(String[] args) {

        //套餐A
        MealBuilder vegMealBuilder = new NonVegMealBuilder();
        //准备套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(vegMealBuilder);
        //获得套餐
        Meal meal = waiter.construct();
        meal.showItems();
        System.out.println(meal.getCost());
    }

}
