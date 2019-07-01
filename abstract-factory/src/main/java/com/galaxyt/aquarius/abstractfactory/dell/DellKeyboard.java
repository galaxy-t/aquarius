package com.galaxyt.aquarius.abstractfactory.dell;

import com.galaxyt.aquarius.abstractfactory.Keyboard;

/**
 * 戴尔键盘
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
public class DellKeyboard implements Keyboard {
    public void rap() {
        System.out.println("戴尔键盘");
    }
}
