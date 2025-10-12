package com.college.oop.encapsulation.model;

public class Student {
    public int id;
    public String name;
    private short age;
    public String groupNumber;

    public Student() {
        this.id = -1;
        this.name = "John Wick";
        this.age = 15;
        this.groupNumber = "Kb-31";
    }

    public Student(int id, String name, short age, String groupNumber) {
        this.id = id;
        this.name = name;
        this.groupNumber = groupNumber;

        setAge(age);
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if (age < 15 || age > 50) {
            System.out.println("Age must be between 15 and 50!");
        } else {
            this.age = age;
        }
    }
}
