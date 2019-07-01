package com.galaxyt.aquarius.abstractfactory.hp;

import com.galaxyt.aquarius.abstractfactory.Keyboard;

/**
 * 惠普键盘
 * @author zhouqi
 * @date 2019-06-28 11:48
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:48     zhouqi          v1.0.0           Created
 *
 */
public class HpKeyboard implements Keyboard {
    public void rap() {
        System.out.println("惠普键盘");
    }
}
