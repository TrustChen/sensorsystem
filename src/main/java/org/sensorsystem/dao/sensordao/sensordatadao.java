package org.sensorsystem.dao.sensordao;

import org.sensorsystem.entity.sensordata;

import java.util.List;

/**
 * Created by chen on 2017/3/21.
 */
public interface sensordatadao {

    List<sensordata> querySensorData(int id);

}
