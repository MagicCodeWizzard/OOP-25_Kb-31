package com.college.oop.exceptions;

import com.college.oop.exceptions.model.exception.MyAgainCustomException;
import com.college.oop.exceptions.model.exception.MyCustomException;
import com.college.oop.exceptions.model.exception.NoSuchStudentException;
import com.college.oop.exceptions.model.exception.StudentDatabaseException;

public final class Main {
    public static void execute(double value)
    {
        if (value < 0.0) {
            throw new IllegalArgumentException("Value bellow zero!");
        }

        //throw new Scanner(System.in);
        try {
            throw new MyCustomException();
        } catch (MyCustomException ex) {

        }

        try {
            throw new MyAgainCustomException("This is my message");
        } catch (RuntimeException ex) {
            System.out.printf("Error - %s%n", ex.getMessage());

            for (var st : ex.getStackTrace()) {
                System.out.printf(" - %s%n", st);
            }
        }

        System.out.println("+++++++++++++++++++++++");

        try {
            throw new NoSuchStudentException("This is my message");
        } catch (RuntimeException ex) {
            System.out.printf("Error - %s%n", ex.getMessage());

            for (var st : ex.getStackTrace()) {
                System.out.printf(" - %s%n", st);
            }
        }
    }

    public static void connectToDatabase(String url) throws StudentDatabaseException
    {
        if (url == null || url.isEmpty()) {
            throw new StudentDatabaseException(String.format("Invalid URL specified!"));
        }
    }


    public static void main(String[] args) {
        execute(1.0);

        try {
            connectToDatabase("http://localhost:9999");
            connectToDatabase("");
        } catch (StudentDatabaseException ex) {
            System.out.println("Error during connection to database: " + ex.getMessage());
        }
    }
}
