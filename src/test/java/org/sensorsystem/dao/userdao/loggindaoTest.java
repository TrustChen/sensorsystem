package org.sensorsystem.dao.userdao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sensorsystem.entity.users;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by chen on 2017/3/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class loggindaoTest {

    @Resource
    private loggindao loggindao;

    @Test
    public void testcheck() throws Exception {

        int id = 1 ;
        String password = "123";
        users users = loggindao.check(id,password);
        System.out.println(users);
        System.out.println(users.getUid()+" "+users.getUname()+" "+users.getPassword());
        /*
        * 测试结果：
        * users{uid=1, uname='赵', password='123'}
          1 赵 123
        * */
    }

    @Test
    public void testinsertUsers() throws Exception {

        loggindao.insertUsers(6,"吴","123");
    }

}