package com.college.oop.collections.comparable;

import java.time.LocalDateTime;

public class Student implements Comparable<Student> {
    private int age;
    private String name;
    private LocalDateTime birth_date;

    public Student(int age, String name, LocalDateTime birth_date) {
        this.age = age;
        this.name = name;
        this.birth_date = birth_date;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
