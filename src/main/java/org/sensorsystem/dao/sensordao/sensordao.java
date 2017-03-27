package org.sensorsystem.dao.sensordao;

import org.apache.ibatis.annotations.Param;
import org.sensorsystem.entity.sensors;

import java.util.List;

/**
 * Created by chen on 2017/3/27.
 */
public interface sensordao {

    void insertsensor(@Param("sname") String sname,
                      @Param("nickname") String nickname,
                      @Param("manufacturer") String manufacturer,
                      @Param("area") String area,
                      @Param("partnumber") String partnumber);

    List<sensors> querysensor();

}
