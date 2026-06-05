package com.college.oop.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        UserRegistry registry = UserRegistry.getInstance();

        registry.addUser(new User());
        registry.addUser(new User());
        registry.addUser(new User());

        UserRegistry registry1 = UserRegistry.getInstance();

        System.out.println(registry == registry1);
    }
}
