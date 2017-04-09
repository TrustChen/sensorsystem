package org.sensorsystem.dao.sensordao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by chen on 2017/3/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class sensordatadaoTest {

    @Resource
    sensordatadao sensordatadao;

    @Test
    public void querySensorData() throws Exception {
        System.out.println(sensordatadao.querySensorData(1,1));
    }

}