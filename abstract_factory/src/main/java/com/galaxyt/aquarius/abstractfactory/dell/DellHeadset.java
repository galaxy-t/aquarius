package com.galaxyt.aquarius.abstractfactory.dell;

import com.galaxyt.aquarius.abstractfactory.Headset;

/**
 * 戴尔耳麦
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
public class DellHeadset implements Headset {
    public void say() {
        System.out.println("戴尔耳麦");
    }
}
