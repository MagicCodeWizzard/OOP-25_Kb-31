package com.college.oop.generics;

public class Student extends Person {
    @Override
    public void showInfo()
    {
        System.out.println("Student Name: "+ name + ", age: " + age);
    }
}
