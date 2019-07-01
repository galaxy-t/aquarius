package com.galaxyt.aquarius.visitor;

/**
 * 元素接口
 * @author zhouqi
 * @date 2019-07-01 18:29
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 18:29     zhouqi          v1.0.0           Created
 *
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}