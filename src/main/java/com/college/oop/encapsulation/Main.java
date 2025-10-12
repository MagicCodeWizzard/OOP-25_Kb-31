package com.college.oop.encapsulation;

import com.college.oop.encapsulation.model.SomeClass;
import com.college.oop.encapsulation.model.Student;

import java.util.Random;

public class Main {
    public static void overloadingExample()
    {
        String str = "3424432";
        String str1 = "af55";
        String str2 = "|||af55||||";

        Integer.parseInt(str);
        Integer.parseInt(str1, 16);
        Integer.parseInt(str2, 3, 7, 16);

        SomeClass someClass = new SomeClass();
        someClass.printInfo();
        someClass.printInfo(5);

        System.out.println(someClass);
    }

    public static void encapsulationExample()
    {
        Random r = new Random();
        int s_id = r.nextInt();

        Student student_a = new Student();
        Student student_b = new Student(s_id, "Valek", (short)17, "Kn-31");

        int age = r.nextInt(1000);
        if (age > 10 && age < 120) {
            student_a.setAge((short)age);
        }
        student_a.groupNumber = "Kn-11";

        student_b.setAge((short)19);

        student_b.setAge((short)-60);
        student_b.groupNumber = "ІКС-41";
        student_b.groupNumber = "Tom";
    }

    public static void main(String[] args) {
        overloadingExample();
        encapsulationExample();
    }
}
