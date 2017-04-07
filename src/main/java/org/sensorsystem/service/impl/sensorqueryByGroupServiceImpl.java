package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensordao;
import org.sensorsystem.entity.sensors;
import org.sensorsystem.service.sensorqueryByGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chen on 2017/4/7.
 */
@Service
public class sensorqueryByGroupServiceImpl implements sensorqueryByGroupService {

    @Autowired
    private sensordao sensordao;

    @Transactional
    public List<sensors> sensorqueryByGroup(String groupname,int uid) {

        return sensordao.querysensorByGroup(groupname,uid);

    }
}
