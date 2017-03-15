package org.sensorsystem.service.impl;

import org.sensorsystem.dao.userdao.loggindao;
import org.sensorsystem.entity.users;
import org.sensorsystem.service.logginService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;



/**
 * Created by chen on 2017/3/15.
 */

@Service
public class logginServiceImpl implements logginService {

    private final String salt = "sa3o0-f-]f0sf0i@$09";

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());


    //注入service依赖
    @Autowired
    private loggindao loggindao;

    public users logginexecute(int id, String password) {

        users users = loggindao.check(id, password);

        return users;
    }

    public void register(int id, String name, String password) {

        loggindao.insertUsers(id, name, password);

    }


    //给密码做md5加密
    private String getmd5(String password){
        String base = password + "/" + salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }


}
