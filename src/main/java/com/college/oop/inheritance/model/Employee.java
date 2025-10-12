package com.college.oop.inheritance.model;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Employee {
    protected String name;
    protected String surname;
    protected String title;
    protected double salary;
    protected short experience;
    protected LocalDateTime hireDate;

    LinkedList<Product> productsSold;

    private boolean isCreated;

    public Employee()
    {
        productsSold = new LinkedList<>();

        System.out.println("<<construct>> Employee");
    }


    public Employee(int productCount){
        productsSold = new LinkedList<>();

        for(int count = 0; count < productCount; count++){
            productsSold.add(new Product());
        }

        System.out.println("<<construct>> Employee(int productCount)");
    }
}
