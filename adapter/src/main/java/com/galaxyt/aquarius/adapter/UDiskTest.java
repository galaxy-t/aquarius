package com.galaxyt.aquarius.adapter;

/**
 * U盘读写测试
 * @author zhouqi
 * @date 2019-06-28 16:17
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 16:17     zhouqi          v1.0.0           Created
 *
 */
public class UDiskTest {


    public static void main(String[] args) {

        Computer thinkpad = new Thinkpad();

        USB uDisk = new UDisk();

        System.out.println(thinkpad.usbRead(uDisk));

        int i = thinkpad.usbWrite(uDisk, "向U盘中写入的内容");

        if (i > 0) {
            System.out.println("写入成功");
        } else {
            System.out.println("写入失败");
        }


    }


}
