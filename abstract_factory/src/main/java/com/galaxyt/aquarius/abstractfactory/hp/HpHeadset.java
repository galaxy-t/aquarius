package com.galaxyt.aquarius.abstractfactory.hp;

import com.galaxyt.aquarius.abstractfactory.Headset;

/**
 * 惠普耳麦
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
public class HpHeadset implements Headset {


    public void say() {
        System.out.println("惠普耳麦");
    }
}
