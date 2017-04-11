package org.sensorsystem.service;


import java.sql.Date;
import java.sql.Time;


/**
 * Created by chen on 2017/4/11.
 */
public interface addSensordataService {

    void addSensordata(String name, Date date, Time time,float data,String unit,int sid);

}
