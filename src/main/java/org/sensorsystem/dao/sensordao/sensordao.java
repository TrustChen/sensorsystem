package org.sensorsystem.dao.sensordao;

import org.apache.ibatis.annotations.Param;
import org.sensorsystem.entity.sensors;

import java.util.List;

/**
 * Created by chen on 2017/3/27.
 */
public interface sensordao {

    void insertsensor(sensors sensors);

    List<sensors> querysensor(@Param("uid") int uid);

}
