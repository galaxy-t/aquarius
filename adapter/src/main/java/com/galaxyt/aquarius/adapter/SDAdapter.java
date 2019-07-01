package com.galaxyt.aquarius.adapter;

/**
 * USB 适配器
 * @author zhouqi
 * @date 2019-06-28 16:26
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 16:26     zhouqi          v1.0.0           Created
 *
 */
public abstract class SDAdapter implements USB {

    protected SD sd;

    abstract void setSd(SD sd);


}
