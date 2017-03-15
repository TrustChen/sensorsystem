package org.sensorsystem.dto;

import org.sensorsystem.entity.users;

/**
 * Created by chen on 2017/3/15.
 */
public class logginSuccess {

    private int id;
    private String name;
    private String password;

    //登录成功的对象
    private logginSuccess logginSuccessuccess;

    //构造函数

    public logginSuccess(int id, String name, String password, logginSuccess logginSuccessuccess) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.logginSuccessuccess = logginSuccessuccess;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public logginSuccess getLogginSuccessuccess() {
        return logginSuccessuccess;
    }

    public void setLogginSuccessuccess(logginSuccess logginSuccessuccess) {
        this.logginSuccessuccess = logginSuccessuccess;
    }
}
