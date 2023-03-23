package com.mehditmimi.myapplication.models;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String pwd;
    private String email;

    private int phone;


    public User(String email, String pwd, String name,int phone) {
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.phone = phone;

    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
