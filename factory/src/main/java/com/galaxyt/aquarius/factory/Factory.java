package com.galaxyt.aquarius.factory;

/**
 * 抽象工厂类
 * @author zhouqi
 * @date 2019-06-27 17:58
 * @version v1.0.0
 * @Description 
 * 
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 17:58     zhouqi          v1.0.0           Created
 *
 */
public abstract class Factory {


    /**
     * 具体工厂的公共接口
     */

    public abstract Product manufacture();

}
