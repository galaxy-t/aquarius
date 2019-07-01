package com.galaxyt.aquarius.interpreter;

/**
 * 表达式实现类
 * @author zhouqi
 * @date 2019-07-01 15:56
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 15:56     zhouqi          v1.0.0           Created
 *
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
