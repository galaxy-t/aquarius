package com.galaxyt.aquarius.interpreter;

/**
 * 解释器接口
 * @author zhouqi
 * @date 2019-07-01 15:43
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 15:43     zhouqi          v1.0.0           Created
 *
 */
public interface Expression {

    boolean interpret(String context);

}
