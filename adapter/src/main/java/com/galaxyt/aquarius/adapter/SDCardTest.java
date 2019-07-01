package com.galaxyt.aquarius.adapter;

public class SDCardTest {


    public static void main(String[] args) {

        Computer thinkpad = new Thinkpad();

        SD sd = new SDCard();

        USB adapter = new KingstonSDAdapter(sd);

        String str = thinkpad.usbRead(adapter);

        System.out.println(str);

        thinkpad.usbWrite(adapter, "向 SD 卡中写入内容");
    }



}
