package org.sensorsystem.service;

import org.sensorsystem.entity.sensordata;

import java.util.List;

/**
 * Created by chen on 2017/3/21.
 */
public interface sensordataqueryService {

    List<sensordata> sensordataquery(int uid,int sid);

}
