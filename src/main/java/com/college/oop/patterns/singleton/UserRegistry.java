package com.college.oop.patterns.singleton;

import java.util.LinkedList;

public class UserRegistry {
    private LinkedList<User> userList;
    private static UserRegistry instance;

    private UserRegistry() {
        this.userList = new LinkedList<>();
    }

    public static UserRegistry getInstance()
    {
        if (instance == null) {
            instance = new UserRegistry();
        }

        return instance;
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void removeUser(User user)
    {
        userList.remove(user);
    }

}
