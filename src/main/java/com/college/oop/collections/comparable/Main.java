package com.college.oop.collections.comparable;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        LinkedList<Student> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.sort(new StudentNameComparator());

        s1.compareTo(s2);
    }
}
