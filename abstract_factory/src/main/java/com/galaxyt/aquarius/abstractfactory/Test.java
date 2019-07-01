package com.galaxyt.aquarius.abstractfactory;

import com.galaxyt.aquarius.abstractfactory.asus.AsusFactory;
import com.galaxyt.aquarius.abstractfactory.dell.DellFactory;
import com.galaxyt.aquarius.abstractfactory.hp.HpFactory;

public class Test {


    public static void main(String[] args) {


        PCAbstractFactory dellFactory = new DellFactory();

        dellFactory.createMouse().click();
        dellFactory.createKeyboard().rap();
        dellFactory.createHeadset().say();

        PCAbstractFactory hpFactory = new HpFactory();

        hpFactory.createMouse().click();
        hpFactory.createKeyboard().rap();
        hpFactory.createHeadset().say();


        PCAbstractFactory asusFactory = new AsusFactory();
        asusFactory.createMouse().click();
        asusFactory.createKeyboard().rap();





    }



}
