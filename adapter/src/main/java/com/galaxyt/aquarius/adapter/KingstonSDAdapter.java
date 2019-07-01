package com.galaxyt.aquarius.adapter;

/**
 * 金士顿SD卡适配器
 * @author zhouqi
 * @date 2019-06-28 16:33
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 16:33     zhouqi          v1.0.0           Created
 *
 */
public class KingstonSDAdapter extends SDAdapter {

    public KingstonSDAdapter(SD sd) {
        super.sd = sd;
    }

    @Override
    void setSd(SD sd) {
        super.sd = sd;
    }

    public String read() {
        return super.sd.read();
    }

    public int write(String str) {
        return super.sd.write(str);
    }
}
