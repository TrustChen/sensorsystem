package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensordao;
import org.sensorsystem.entity.sensors;
import org.sensorsystem.service.sensorqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chen on 2017/3/27.
 */
@Service
public class sensorqueryServiceImpl implements sensorqueryService {

    @Autowired
    private sensordao sensordao;

    @Transactional
    public List<sensors> sensorquery(int uid) {
        return sensordao.querysensor(uid);
    }
}
