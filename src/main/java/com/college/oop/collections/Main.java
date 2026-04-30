package com.college.oop.collections;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void vectorDemo(Scanner scanner)
    {
        String val = "Hello!";

        // Vector()
        // Vector(initial_capacity)
        var myVector = new Vector<String>(40, 0);

        myVector.add("Hello!");
        myVector.add(val);

        System.out.print("Please enter new index: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        myVector.add(index, "ABOBA");

        System.out.println("Result vector:");
        for (var str : myVector) {
            System.out.println(str);
        }

        for (int i = 0; i < myVector.size(); i++) {
            System.out.println(myVector.get(i));
        }

        System.out.println("String found -> " + myVector.contains("Hello!"));

        int initial_capacity = myVector.capacity();

        System.out.println("Vector capacity > " + myVector.capacity());
        for (int i = myVector.size() - 1; i < initial_capacity; ++i) {
            myVector.add("Hello #" + i);
        }
        System.out.println("Vector capacity > " + myVector.capacity());
    }

    private static void customListDemo(Scanner scanner)
    {
        MyCustomListNode firstNode = new MyCustomListNode();

        System.out.println("Please enter elements to add");
        firstNode.setValue(scanner.nextDouble());
        scanner.nextLine();

        MyCustomListNode secondNode = new MyCustomListNode();
        System.out.println("Please enter elements to add");
        secondNode.setValue(scanner.nextDouble());
        scanner.nextLine();

        MyCustomListNode thirdNode = new MyCustomListNode();
        System.out.println("Please enter elements to add");
        thirdNode.setValue(scanner.nextDouble());
        scanner.nextLine();

        MyCustomListNode fourthNode = new MyCustomListNode();
        System.out.println("Please enter elements to add");
        fourthNode.setValue(scanner.nextDouble());
        scanner.nextLine();

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(fourthNode);

        var currentElement = firstNode;
        while (currentElement != null) {
            System.out.println("Value -> " + currentElement.getValue());
            currentElement = currentElement.getNext();
        }

        LinkedList<String> list = new LinkedList<>();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //vectorDemo(s);
        customListDemo(s);

        s.close();

        LinkedList<Integer> l;
    }
}
