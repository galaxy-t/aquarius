package com.galaxyt.aquarius.observer;

/**
 * 观察者接口
 * @author zhouqi
 * @date 2019-07-01 17:25
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 17:25     zhouqi          v1.0.0           Created
 *
 */
public abstract class Observer {

    /**
     * 被观察者
     */
    protected Subject subject;

    /**
     * 通知方法
     */
    public abstract void update();

}
