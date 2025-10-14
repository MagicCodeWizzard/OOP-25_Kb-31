package com.college.oop.inheritance;

import com.college.oop.inheritance.model.Employee;
import com.college.oop.inheritance.model.Executive;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(10);

        System.out.println("+++++++++++++++++");

        Executive employee1 = new Executive();

        employee.workshiftStart(LocalDateTime.now());
        employee.workshiftEnd(LocalDateTime.now().plusHours(10));

        employee1.workshiftStart(LocalDateTime.now().minusHours(3));
        employee1.workshiftEnd(LocalDateTime.now().plusHours(10));
    }
}
