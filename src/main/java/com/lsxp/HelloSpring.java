package com.lsxp;

public class HelloSpring {

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.println("hello Spring！"+this.userName);
    }
}