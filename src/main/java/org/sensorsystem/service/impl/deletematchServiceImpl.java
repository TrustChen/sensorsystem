package org.sensorsystem.service.impl;

import org.sensorsystem.dao.sensordao.matchdeletedao;
import org.sensorsystem.service.deletematchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2017/3/29.
 */
@Service
public class deletematchServiceImpl implements deletematchService {

    @Autowired
    private matchdeletedao matchdeletedao;

    @Transactional
    public void deletematch(int uid, int sid) {

        matchdeletedao.deletematch(uid,sid);

    }
}
