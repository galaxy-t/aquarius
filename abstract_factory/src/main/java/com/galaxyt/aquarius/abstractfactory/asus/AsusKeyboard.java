package com.galaxyt.aquarius.abstractfactory.asus;

import com.galaxyt.aquarius.abstractfactory.Keyboard;

/**
 * 华硕键盘
 * @author zhouqi
 * @date 2019-06-28 11:46
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:46     zhouqi          v1.0.0           Created
 *
 */
public class AsusKeyboard implements Keyboard {
    public void rap() {
        System.out.println("华硕键盘");
    }
}
