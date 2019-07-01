package com.galaxyt.aquarius.abstractfactory;

/**
 * 抽象工场类
 * 所有的工场均需要实现本类
 * @author zhouqi
 * @date 2019-06-28 11:08
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:08     zhouqi          v1.0.0           Created
 *
 */
public interface PCAbstractFactory {

    Mouse createMouse();

    Keyboard createKeyboard();

    Headset createHeadset();


}
