package org.sensorsystem.service.impl;

import org.sensorsystem.dao.unitdao.unitdao;
import org.sensorsystem.service.addunitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2017/3/29.
 */
@Service
public class addunitServiceImpl implements addunitService {

    @Autowired
    private unitdao unitdao;

    @Transactional
    public void addunit(String unit, float rate, int m, int kg, int s, int a, int k, int mol, int cd) {

        unitdao.insertunit(unit,rate,m,kg,s,a,k,mol,cd);

    }
}
