package com.xxx.entity;

public class Post {
    private int uid;
    private int cid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Post(int uid, int cid) {
        this.uid = uid;
        this.cid = cid;
    }
}
