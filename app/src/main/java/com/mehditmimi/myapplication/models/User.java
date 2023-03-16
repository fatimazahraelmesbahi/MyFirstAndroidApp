package com.mehditmimi.myapplication.models;

public class User {
    private String name;
    private String pwd;
    private String email;


    public User(String email, String pwd, String name) {
        this.email = email;
        this.pwd = pwd;
        this.name = name;

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
