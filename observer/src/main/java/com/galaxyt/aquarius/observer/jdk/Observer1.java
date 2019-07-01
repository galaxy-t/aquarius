package com.galaxyt.aquarius.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者1
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
public class Observer1 implements Observer {

    public Observer1(Subject subject) {
        super();
        subject.addObserver(this);
    }


    public void update(Observable o, Object arg) {

        Subject subject = (Subject) o;

        System.out.println("观察者1：" + subject.getData());

    }


}
