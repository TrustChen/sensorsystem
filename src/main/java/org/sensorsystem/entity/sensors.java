package org.sensorsystem.entity;

/**
 * Created by chen on 2017/3/13.
 */
public class sensors {

    private int sid;

    private String sname;

    private String nickname;

    private String manufacturer;

    private String area;

    private String partnumber;

    private String groupname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Override
    public String toString() {
        return "sensors{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", area='" + area + '\'' +
                ", partnumber='" + partnumber + '\'' +
                '}';
    }
}
