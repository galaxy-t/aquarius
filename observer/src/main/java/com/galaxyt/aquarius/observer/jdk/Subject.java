package com.galaxyt.aquarius.observer.jdk;

import java.util.Observable;

/**
 * 被观察者
 * 原生java观察者模式实现
 * @author zhouqi
 * @date 2019-07-01 17:34
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 17:34     zhouqi          v1.0.0           Created
 *
 */
public class Subject extends Observable {

    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;

        super.setChanged(); //设置已经改动
        super.notifyObservers(); //通知观察者，只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。

    }
}
