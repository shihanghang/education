package com.edu.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: ZzuI
 * @Date: 2019/9/23 16:12
 * @Description:
 */
public class Urp implements Serializable {
    public  String uName;
    public String rName;
    public List<String> pName;

    public Urp() {
    }

    public Urp(String uName, String rName, List<String> pName) {
        this.uName = uName;
        this.rName = rName;
        this.pName = pName;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public List<String> getpName() {
        return pName;
    }

    public void setpName(List<String> pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Urp{" +
                "uName='" + uName + '\'' +
                ", rName='" + rName + '\'' +
                ", pName=" + pName +
                '}';
    }
}
