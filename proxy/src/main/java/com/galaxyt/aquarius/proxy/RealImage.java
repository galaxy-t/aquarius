package com.galaxyt.aquarius.proxy;

/**
 * 真实的图片实现类
 * @author zhouqi
 * @date 2019-07-01 10:42
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-07-01 10:42     zhouqi          v1.0.0           Created
 *
 */
public class RealImage implements Image {

    /**
     * 图片名称
     */
    private String fileName;

    /**
     * 构造函数
     * 传入图片名称
     * 根据图片名称加载图片
     * @param fileName
     */
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    /**
     * 释放图片
     */
    public void display() {
        System.out.println("释放 " + fileName);
    }

    /**
     * 加载图片
     * @param fileName
     */
    private void loadFromDisk(String fileName){
        System.out.println("加载 " + fileName);
    }
}
