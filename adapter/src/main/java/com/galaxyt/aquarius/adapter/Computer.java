package com.galaxyt.aquarius.adapter;

/**
 * 电脑接口
 * @author zhouqi
 * @date 2019-06-28 16:04
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 16:04     zhouqi          v1.0.0           Created
 *
 */
public interface Computer {

    String usbRead(USB usb);

    int usbWrite(USB usb,String str);


}
