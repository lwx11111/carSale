package com.xxx.entity;

public class User {
    private int uid;
    private String uname;
    private  String upwd;
    private String nickname;
    private String profile;
    private String picPath;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public User(int uid, String uname, String upwd){
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;

    }

    public User(String uname, String upwd, String nickname, String profile, String picPath) {
        this.uname = uname;
        this.upwd = upwd;
        this.nickname = nickname;
        this.profile = profile;
        this.picPath = picPath;
    }

    public User(String uname, String upwd){

        this.uname = uname;
        this.upwd = upwd;

    }


    public User() {

    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


}
