package org.sensorsystem.service;

import org.sensorsystem.dto.logginSuccess;
import org.sensorsystem.entity.users;

/**
 * Created by chen on 2017/3/15.
 */
public interface logginService {

    //执行登录操作
    users logginexecute(int id, String password);

    //注册操作
    void register(int id, String name, String password);

}
