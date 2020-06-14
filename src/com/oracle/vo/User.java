package com.oracle.vo;

public class User {
    private int userid;
    private String userName;
    private int remain;

    public User() {
        super();
    }

    public User(int userid,String userName, int remain) {
        this.userid=userid;
        this.userName = userName;
        this.remain = remain;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public int getUserid() {

        return userid;
    }

    public String getUserName() {
        return userName;
    }

    public int getRemain() {
        return remain;
    }
}
