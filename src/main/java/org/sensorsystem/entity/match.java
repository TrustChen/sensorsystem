package org.sensorsystem.entity;

/**
 * Created by chen on 2017/3/13.
 */
public class match {

    private int uid;

    private int sid;

    private int group;

    private String groupname;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Override
    public String toString() {
        return "match{" +
                "uid=" + uid +
                ", sid=" + sid +
                ", group=" + group +
                ", groupname='" + groupname + '\'' +
                '}';
    }
}
