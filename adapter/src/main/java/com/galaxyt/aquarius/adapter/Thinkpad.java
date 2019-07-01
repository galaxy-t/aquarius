package com.galaxyt.aquarius.adapter;

/**
 * Thinkpad电脑
 * @author zhouqi
 * @date 2019-06-28 16:13
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 16:13     zhouqi          v1.0.0           Created
 *
 */
public class Thinkpad implements Computer {
    public String usbRead(USB usb) {
        return usb.read();
    }

    public int usbWrite(USB usb, String str) {
        return usb.write(str);
    }
}
