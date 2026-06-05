package com.college.oop.patterns.singleton;

public class User {
    private String name;

    public User() {
        name = "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
