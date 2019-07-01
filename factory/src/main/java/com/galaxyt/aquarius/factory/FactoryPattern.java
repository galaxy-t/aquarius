package com.galaxyt.aquarius.factory;

/**
 * 生产工作流程
 * @author zhouqi
 * @date 2019-06-27 18:03
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-27 18:03     zhouqi          v1.0.0           Created
 *
 */
public class FactoryPattern {

    /**
     * 调用者不需要知道具体的产品对象，但是需要明确生产该对象的具体工场
     * @param args
     */
    public static void main(String[] args) {
        //客户要产品A
        FactoryA mFactoryA = new FactoryA();
        mFactoryA.manufacture().show();

        //客户要产品B
        FactoryB mFactoryB = new FactoryB();
        mFactoryB.manufacture().show();
    }



}
