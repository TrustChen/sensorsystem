package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensordao;
import org.sensorsystem.dao.sensordao.sensormatchdao;
import org.sensorsystem.entity.sensors;
import org.sensorsystem.service.addsensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2017/3/27.
 */
@Service
public class addsensorServiceImpl implements addsensorService {

    @Autowired
    private sensordao sensordao;

    @Autowired
    protected sensormatchdao sensormatchdao;

    @Transactional
    public void addsensor(int sid,int userId,String sname, String nickname, String manufacturer, String area, String partnumber,String groupname,String unit) {

        sensors sensor = new sensors();
        sensor.setSid(sid);
        sensor.setSname(sname);
        sensor.setNickname(nickname);
        sensor.setManufacturer(manufacturer);
        sensor.setArea(area);
        sensor.setPartnumber(partnumber);
        sensor.setGroupname(groupname);
        sensor.setUnit(unit);

        sensordao.insertsensor(sensor);
        System.out.println(sensor);

        sensormatchdao.insertmatch(userId,sensor.getSid());
    }
}
