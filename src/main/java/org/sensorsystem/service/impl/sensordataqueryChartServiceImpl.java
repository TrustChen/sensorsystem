package org.sensorsystem.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.sensorsystem.dao.sensordao.sensordatadao;
import org.sensorsystem.service.sensordataqueryChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by chen on 2017/4/18.
 */
@Service
public class sensordataqueryChartServiceImpl implements sensordataqueryChartService {


    @Autowired
    private sensordatadao sensordatadao;

    @Transactional
    public JSONObject sensordataqueryChart(int uid, int sid) {
        return sensordatadao.sensordataqueryChart(uid, sid);
    }
}



