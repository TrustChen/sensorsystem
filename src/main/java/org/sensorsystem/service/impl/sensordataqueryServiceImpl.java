package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensordatadao;
import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.sensordataqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chen on 2017/3/21.
 */

@Service
public class sensordataqueryServiceImpl implements sensordataqueryService {

    @Autowired
    private sensordatadao sensordatadao;

    @Transactional
    public List<sensordata> sensordataquery(int id) {

        List<sensordata> sensordata = sensordatadao.querySensorData(id);

        return sensordata;
    }
}
