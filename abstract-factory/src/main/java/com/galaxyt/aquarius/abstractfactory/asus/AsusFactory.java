package com.galaxyt.aquarius.abstractfactory.asus;

import com.galaxyt.aquarius.abstractfactory.Headset;
import com.galaxyt.aquarius.abstractfactory.Keyboard;
import com.galaxyt.aquarius.abstractfactory.Mouse;
import com.galaxyt.aquarius.abstractfactory.PCAbstractFactory;

/**
 * 华硕工场
 * @author zhouqi
 * @date 2019-06-28 11:51
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:51     zhouqi          v1.0.0           Created
 *
 */
public class AsusFactory implements PCAbstractFactory {
    public Mouse createMouse() {
        return new AsusMouse();
    }

    public Keyboard createKeyboard() {
        return new AsusKeyboard();
    }

    public Headset createHeadset() {
        return null;
    }
}
