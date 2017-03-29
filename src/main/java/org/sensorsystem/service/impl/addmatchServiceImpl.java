package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensormatchdao;
import org.sensorsystem.service.addmatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2017/3/29.
 */
@Service
public class addmatchServiceImpl implements addmatchService {

    @Autowired
    private sensormatchdao sensormatchdao;

    @Transactional
    public void insertmatch(int uid, int sid) {

        sensormatchdao.insertmatch(uid,sid);

    }
}
