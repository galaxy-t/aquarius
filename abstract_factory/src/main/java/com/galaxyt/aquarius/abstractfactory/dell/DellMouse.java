package com.galaxyt.aquarius.abstractfactory.dell;

import com.galaxyt.aquarius.abstractfactory.Mouse;

/**
 * 戴尔鼠标
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
public class DellMouse implements Mouse {
    public void click() {
        System.out.println("戴尔鼠标");
    }
}
