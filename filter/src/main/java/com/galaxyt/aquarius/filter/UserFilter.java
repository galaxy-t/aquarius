package com.galaxyt.aquarius.filter;

import java.util.List;

/**
 * 用户过滤器
 * @author zhouqi
 * @date 2019-06-28 17:09
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-28 17:09     zhouqi          v1.0.0           Created
 *
 */
public interface UserFilter {


    List<User> filter(List<User> list);



}
