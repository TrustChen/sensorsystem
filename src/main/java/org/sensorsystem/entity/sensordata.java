package org.sensorsystem.entity;


import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by chen on 2017/3/21.
 */
public class sensordata {

    private int id;
    private String name;
    private Date date;
    private Time time;
    private float data;
    private String unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "sensordata{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", data='" + data + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}

