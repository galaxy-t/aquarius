package com.galaxyt.aquarius.adapter;

/**
 * SD 卡
 * @author zhouqi
 * @date 2019-06-28 16:23
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 16:23     zhouqi          v1.0.0           Created
 *
 */
public class SDCard implements SD {
    public String read() {
        return "读取 SD 卡中的内容";
    }

    public int write(String str) {

        System.out.println(str);

        return 1;
    }
}
