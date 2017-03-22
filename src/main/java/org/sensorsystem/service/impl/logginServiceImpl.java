package org.sensorsystem.service.impl;

import org.sensorsystem.dao.userdao.loggindao;
import org.sensorsystem.entity.users;
import org.sensorsystem.service.logginService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    /*
    * 使用注解控制事物方法的优点
    * 1.开发团队达成一致约定:明确标注事务方法的编程风格
    * 2:保证事务方法的执行时间尽可能短,不要穿插其他网络操作(RPC/HTTP请求或者剥离到事务方法外部)
    * 3:不是所有的方法都需要事务,比如只有一条修改操作,只读操作不需要事务控制
    * */
    @Transactional
    public boolean logginexecute(int id, String password) {

        users users = loggindao.check(id, password);
        if (users != null){
            //if (users.getUid() == id && users.getPassword().equals(password)){
                return true;
            //}
        }
        return false;

    }

    @Transactional
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
