package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.sensordao;
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

    @Transactional
    public void addsensor(String sname, String nickname, String manufacturer, String area, String partnumber) {

        sensordao.insertsensor(sname,nickname,manufacturer,area,partnumber);

    }
}
