package com.college.oop.collections.set;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        String s = "Hello!";

        String[] array = new String[5];
        array[0] = s;
        array[1] = "Hello";
        array[2] = "Hello!";
        array[3] = "Hello!";
        array[4] = "Hello!";

        LocalDateTime[] date_array = new LocalDateTime[3];
        LocalDateTime date = LocalDateTime.of(2026, Month.APRIL, 3, 13, 13);

        date_array[0] = date;
        date_array[1] = date;
        date_array[2] = date;

        for (var obj : date_array) {
            System.out.println(obj);
        }

        Student[] student_arr = new Student[3];
        Student student = new Student();
        student.setName("Alex");

        student_arr[0] = student.clone();
        student_arr[1] = student.clone();
        student_arr[2] = student.clone();

        for (var obj : student_arr) {
            System.out.println(obj);
        }

        student_arr[1].setName("Nicolas");

        for (var obj : student_arr) {
            System.out.println(obj);
        }

        // Немодифікована множина
        var mySet = Set.of("Hello", "World!", "hi");
        for (var val : mySet) {
            System.out.println("Set value -> " + val);
        }

        HashSet<String> hs = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            System.out.print("Enter new string > ");
            hs.add(scanner.nextLine());

            System.out.println("+++++++++");
            for (var value : hs) {
                System.out.println("HashSet value -> " + value);
            }
            System.out.println("+++++++++");
        }

        scanner.close();

        System.out.println("HashSet metrics: ");
        System.out.println("Size: " + hs.size());
        System.out.println("DOes hash set has value 'Hello'? -> " + hs.contains("Hello"));

        hs.clear();

        HashSet<Student> student_set = new HashSet<>();

    }
}
