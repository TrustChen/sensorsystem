package org.sensorsystem.service.impl;

import org.sensorsystem.dao.userdao.loggindao;
import org.sensorsystem.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2017/3/21.
 */

@Service
public class RegisterServiceTest implements registerService {

    @Autowired
    private loggindao loggindao;

    @Transactional
    public void insertUsers(int id, String name, String password) {

        loggindao.insertUsers(id, name, password);

    }
}
