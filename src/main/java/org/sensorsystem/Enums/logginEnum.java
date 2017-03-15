package org.sensorsystem.Enums;

/**
 *
 * 目前没啥用，可以删除，有跟状态相关时可以使用，使用枚举有利于转换成json传输数据
 *
 *
 * 使用枚举表示常量数据
 * Created by chen on 2017/3/15.
 */
public enum  logginEnum {
    ;

    private int id;

    private String password;

    private String name;

    logginEnum(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
