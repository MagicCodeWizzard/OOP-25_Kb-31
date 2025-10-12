package com.college.oop.inheritance.model;

public class Executive extends Employee {
    private String nameOfBusiness;

    public Executive() {
        super();
        //nameOfBusiness = "";

        System.out.println("<<construct>> Executive");
    }

    public Executive(int productCount) {
        super(productCount);
    }

    public String toString() {
        String result = "Values: " + this.surname;
        return result;
    }
}
