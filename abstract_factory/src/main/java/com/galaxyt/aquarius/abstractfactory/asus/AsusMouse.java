package com.galaxyt.aquarius.abstractfactory.asus;

import com.galaxyt.aquarius.abstractfactory.Mouse;

/**
 * 华硕鼠标
 * @author zhouqi
 * @date 2019-06-28 11:45
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 11:45     zhouqi          v1.0.0           Created
 *
 */
public class AsusMouse implements Mouse {
    public void click() {

        System.out.println("华硕鼠标");

    }
}
