package com.college.oop.patterns;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();

        Student s = builder.addAge(34).setName("Lion").build();


    }
}
