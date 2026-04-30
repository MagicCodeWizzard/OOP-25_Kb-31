package com.college.oop.collections.set;

import java.util.Objects;

public class Student implements Cloneable {
    private String name;
    private String group;

    void setName(String value)
    {
        name = value;
    }

    String getName()
    {
        return name;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group);
    }
}
