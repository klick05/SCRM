package com.seu.scrm.Entity;

import java.io.Serializable;

public class Orders implements Serializable {
    private String user_id;
    private String prod_asin;
    private int rate;
    private int unix_time;
    private int num;
    private static final long serialVersionUID = -3946734305303957850L;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getProd_asin() {
        return prod_asin;
    }

    public void setProd_asin(String prod_asin) {
        this.prod_asin = prod_asin;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getUnix_time() {
        return unix_time;
    }

    public void setUnix_time(int unix_time) {
        this.unix_time = unix_time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
