package org.sensorsystem.dao.userdao;

import org.apache.ibatis.annotations.Param;
import org.sensorsystem.entity.users;

/**
 * Created by chen on 2017/3/14.
 */
public interface loggindao {

    //快速生成junit单元测试用例快捷键，鼠标指在类名上，，，ctrl+shift+T

    /*
    * 查询用户名是否正确
    * */
     users check(@Param("id") int id, @Param("password") String password);
     /*users check(int id, String password);*/


     /*.
     * 用户注册时的数据插入
     * */
     void insertUsers(@Param("id")int id, @Param("name")String name, @Param("password")String password);


}
