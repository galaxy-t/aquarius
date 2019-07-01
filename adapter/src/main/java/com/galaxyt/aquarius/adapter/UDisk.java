package com.galaxyt.aquarius.adapter;

/**
 * U盘
 * @author zhouqi
 * @date 2019-06-28 16:14
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 16:14     zhouqi          v1.0.0           Created
 *
 */
public class UDisk implements USB {
    public String read() {
        return "U盘读取的内容";
    }

    public int write(String str) {

        System.out.println(str);

        return 1;
    }
}
