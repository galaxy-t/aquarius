package com.galaxyt.aquarius.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author zhouqi
 * @date 2019-07-01 17:24
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 17:24     zhouqi          v1.0.0           Created
 *
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    /**
     * 调用本方法会改变状态
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        //通知观察者
        notifyAllObservers();
    }

    /**
     * 添加一个观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知观察者状态改变
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
