package org.sensorsystem.dao.sensordao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by chen on 2017/3/29.
 */
public interface sensormatchdao {

    void  insertmatch(@Param("uid") int uid, @Param("sid")int sid);

}
