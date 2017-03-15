package org.sensorsystem.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by chen on 2017/3/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
                     "classpath:spring/spring-service.xml"})
public class logginServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private logginService logginService;

    @Test
    public void logginexecute() throws Exception {

        int id = 1;
        String password = "123";
        logginService.logginexecute(id, password);
    }

    @Test
    public void register() throws Exception {
        int id = 7;
        String name = "郑";
        String password = "123";
        logginService.register(id, name, password);
    }

}