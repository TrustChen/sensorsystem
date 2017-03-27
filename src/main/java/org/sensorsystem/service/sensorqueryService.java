package org.sensorsystem.service;

import org.sensorsystem.entity.sensors;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chen on 2017/3/27.
 */
@Service
public interface sensorqueryService {

    List<sensors> sensorquery();

}
