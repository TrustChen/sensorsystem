package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensordatadao;
import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.sensordataqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2017/3/21.
 */
public class sensordataqueryServiceImpl implements sensordataqueryService {

    @Autowired
    private sensordatadao sensordatadao;

    @Transactional
    public sensordata sensordataquery(int sid) {

        sensordata sensordata = sensordatadao.querySensorData(sid);

        return sensordata;
    }
}
