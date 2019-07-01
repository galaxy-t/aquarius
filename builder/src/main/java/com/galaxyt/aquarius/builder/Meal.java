package com.galaxyt.aquarius.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 膳食
 * 具体最终需要建造出来的对象
 * @author zhouqi
 * @date 2019-06-28 14:09
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 14:09     zhouqi          v1.0.0           Created
 *
 */
public class Meal {

    /**
     * 膳食套餐包含的全部食物
     */
    private List<Item> items = new ArrayList<Item>();

    /**
     * 新增食物
     * @param item
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 计算总价格
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 打印套餐详情
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
