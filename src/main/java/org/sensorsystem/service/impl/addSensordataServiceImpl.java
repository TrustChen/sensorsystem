package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensordao;
import org.sensorsystem.dao.sensordao.sensordatadao;
import org.sensorsystem.entity.sensordata;
import org.sensorsystem.service.addSensordataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Time;

/**
 * Created by chen on 2017/4/11.
 */
@Service
public class addSensordataServiceImpl implements addSensordataService {

    @Autowired
    private sensordatadao sensordatadao;

    @Transactional
    public void addSensordata(String name, Date date, Time time, float data, String unit, int sid) {

        sensordata sensordata = new sensordata();
        sensordata.setName(name);
        sensordata.setDate(date);
        sensordata.setTime(time);
        sensordata.setData(data);
        sensordata.setUnit(unit);
        sensordata.setSid(sid);

        sensordatadao.insertSensordata(sensordata);

    }
}
