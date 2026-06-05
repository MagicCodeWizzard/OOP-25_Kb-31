package com.college.oop.functional_interfaces;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static double execute(Scanner scanner, Operation<Double> myOperation)
    {
        System.out.print("Please, enter first argument -> ");
        double value1 = scanner.nextDouble();

        System.out.print("Please, enter second argument -> ");
        double value2 = scanner.nextDouble();

        double result = myOperation.doOperation(value1, value2);

        System.out.println("Result -> " + result);

        return result;
    }

    public static void stdFunctionalInterfaces()
    {
        Predicate<LocalDateTime> p = (date) -> {
            return date.isBefore(LocalDateTime.now());
        };

        boolean result = p.test(LocalDateTime.now().minusDays(1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MathematicalOperations math = new MathematicalOperations();

        execute(scanner, MathematicalOperations::plus);
        execute(scanner, MathematicalOperations::minus);
        execute(scanner, MathematicalOperations::multiply);
        execute(scanner, MathematicalOperations::divide);

        execute(scanner, math::equation);

        execute(scanner, new Operation<Double>() {
            @Override
            public Double doOperation(Double arg1, Double arg2) {
                return 0.0;
            }
        });

        execute(scanner, (Double a, Double b) -> {
            return a + b;
        });

        stdFunctionalInterfaces();
    }
}
