package org.sensorsystem.dao.unitdao;

import org.apache.ibatis.annotations.Param;
import org.sensorsystem.entity.unitconversion;

import java.util.List;

/**
 * Created by chen on 2017/3/29.
 */
public interface unitdao {

    void insertunit(@Param("unit") String unit,
                    @Param("rate") float rate,
                    @Param("m") int m,
                    @Param("kg") int kg,
                    @Param("s") int s,
                    @Param("a") int a,
                    @Param("k") int k,
                    @Param("mol") int mol,
                    @Param("cd") int cd);

    List<unitconversion> queryunit();

}
