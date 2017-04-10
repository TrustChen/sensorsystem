package org.sensorsystem.service.impl;

import org.sensorsystem.dao.unitdao.unitdao;
import org.sensorsystem.entity.unitconversion;
import org.sensorsystem.service.unitqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chen on 2017/4/10.
 */
@Service
public class unitqueryServiceImpl implements unitqueryService {

    @Autowired
    private unitdao unitdao;

    @Transactional
    public List<unitconversion> unitquery() {

        return unitdao.queryunit();

    }
}
