package org.sensorsystem.service;

import org.sensorsystem.entity.sensors;

import java.util.List;

/**
 * Created by chen on 2017/4/7.
 */
public interface sensorqueryByGroupService {

    List<sensors> sensorqueryByGroup(String groupname, int uid);

}
