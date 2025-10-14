package com.college.oop.inheritance.model;

import java.io.Serial;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;

public class Executive extends Employee {
    private String nameOfBusiness;

    public static final int DEFAULT_EMPLOYEE_NUMBER = 10;

    public Executive() {
        super(DEFAULT_EMPLOYEE_NUMBER);

        System.out.println("<<construct>> Executive()");

        nameOfBusiness = "";
    }

    public Executive(int productCount) {
        super(productCount);

        System.out.println("<<construct>> Executive(productCount)");
    }

    @Override
    public String toString() {
        String result = "Values: " + this.surname;
        result += "My salary: ";
        return result;
    }

    public boolean signDocument(Document document)
    {
        System.out.println("Наступна юдина буде підписувати документ:");
        System.out.println(super.toString());

        for (Employee employee : document.getSignatories()) {
            System.out.println(employee.toString());
        }

        return document.getSignatories().length > 2;
    }

    public void onboardBarmen(Barmen barmen)
    {
        if (barmen.experience > 2 && barmen.salary < 15000) {
            System.out.println("Бармен прийнятий!");
        } else {
            System.out.println("Бармена відхилено!");
        }
    }

    public void discardBarmen(Barmen barmen)
    {
        if (barmen.experience < 10 && barmen.productsSold.isEmpty()) {
            System.out.println("Бармена звільнено!");
        } else {
            System.out.println("Бармен залишається!");
        }
    }

    @Override
    public boolean workshiftStart(LocalDateTime time)
    {
        if (time.getHour() < 6 || time.getHour() > 15) {
            System.out.println("Executive cannot work!");
            return false;
        }

        return super.workshiftStart(time);
    }

    @Override
    public boolean workshiftEnd(LocalDateTime time)
    {
        if (time.getHour() < 6 || time.getHour() > 15) {
            return super.workshiftEnd(time);
        }

        System.out.println("Executive still busy!");
        return false;
    }

    private String countSalary()
    {
        return String.format("My salary is: %.4f", salary);
    }

}
