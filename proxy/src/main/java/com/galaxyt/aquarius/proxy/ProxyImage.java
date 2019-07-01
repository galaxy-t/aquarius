package com.galaxyt.aquarius.proxy;

/**
 * 代理图片实现类
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
public class ProxyImage implements Image{

    /**
     * 真实图片
     */
    private RealImage realImage;

    /**
     * 图片name
     */
    private String fileName;

    /**
     * 传入图片名称
     * @param fileName
     */
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    /**
     * 若真实图片对象存在则直接执行释放
     * 若不存在则先根据图片名称创建真实图片对象
     * 此处使用代理模式将真实图片对象缓存到了内存中
     * 跟具体的例子其实不太匹配，因为图片释放之后需要清楚内存中缓存的对象
     */
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
