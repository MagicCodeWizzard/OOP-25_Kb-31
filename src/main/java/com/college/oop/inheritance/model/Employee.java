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

//    public Employee()
//    {
//        productsSold = new LinkedList<>();
//
//        System.out.println("<<construct>> Employee");
//    }


    public Employee(int productCount){
        productsSold = new LinkedList<>();

        for(int count = 0; count < productCount; count++){
            productsSold.add(new Product());
        }

        System.out.println("<<construct>> Employee(int productCount)");
    }

    public boolean workshiftStart(LocalDateTime time)
    {
        System.out.println("Зміну розпочато об " + time);
        return true;
    }

    public boolean workshiftEnd(LocalDateTime time)
    {
        System.out.println("Зміну завершено об " + time);
        return true;
    }

    private String countSalary()
    {
        return String.format("%.2f", salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                ", hireDate=" + hireDate +
                ", productsSold=" + productsSold +
                ", isCreated=" + isCreated +
                '}';
    }
}
