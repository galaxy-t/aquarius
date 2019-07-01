package com.galaxyt.aquarius.adapter;

/**
 * USB 接口
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
public interface USB {


    String read();

    int write(String str);



}
