package com.galaxyt.aquarius.abstractfactory.dell;

import com.galaxyt.aquarius.abstractfactory.Headset;
import com.galaxyt.aquarius.abstractfactory.Keyboard;
import com.galaxyt.aquarius.abstractfactory.Mouse;
import com.galaxyt.aquarius.abstractfactory.PCAbstractFactory;

/**
 * 戴尔工场
 * @author zhouqi
 * @date 2019-06-28 11:50
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:50     zhouqi          v1.0.0           Created
 *
 */
public class DellFactory implements PCAbstractFactory {
    public Mouse createMouse() {
        return new DellMouse();
    }

    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

    public Headset createHeadset() {
        return new DellHeadset();
    }
}
