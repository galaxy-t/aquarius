package com.galaxyt.aquarius.abstractfactory.hp;

import com.galaxyt.aquarius.abstractfactory.Headset;
import com.galaxyt.aquarius.abstractfactory.Keyboard;
import com.galaxyt.aquarius.abstractfactory.Mouse;
import com.galaxyt.aquarius.abstractfactory.PCAbstractFactory;

/**
 * 惠普工场
 * @author zhouqi
 * @date 2019-06-28 11:49
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:49     zhouqi          v1.0.0           Created
 *
 */
public class HpFactory implements PCAbstractFactory {
    public Mouse createMouse() {
        return new HpMouse();
    }

    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }

    public Headset createHeadset() {
        return new HpHeadset();
    }
}
