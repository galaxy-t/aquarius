package com.galaxyt.aquarius.abstractfactory.hp;

import com.galaxyt.aquarius.abstractfactory.Mouse;

/**
 * 惠普鼠标
 * @author zhouqi
 * @date 2019-06-28 11:47
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:47     zhouqi          v1.0.0           Created
 *
 */
public class HpMouse implements Mouse {
    public void click() {
        System.out.println("惠普鼠标");
    }
}
