package com.college.oop.generics;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ListNode node = new ListNode(null, null, 34);

        // int; - примітивний тип
        // Integer; - посилкови тип, клас - з якого створено об`єкт

        ListNode node1 = new ListNode(null, null, "Hello!");
        ListNode nodeMiddle = new ListNode(node, node1, LocalDateTime.now());

        processList(nodeMiddle);
        processList(node);
        processList(node1);

        GenericListNode<String> gen_node = new GenericListNode<>();
        gen_node.setValue("String");

        GenericListNode<LocalDate> gen_node1 = new GenericListNode<>();
        gen_node1.setValue(LocalDate.now());

        PeopleListNode<Person, Student> val = new PeopleListNode<>();
    }

    private static void processList(ListNode myList) {
        Object value = myList.getValue();
        System.out.println(value.toString());

        if (value instanceof LocalDateTime || value instanceof String) {
            LocalDateTime convertedValue = (LocalDateTime) value;
            String formatedTime = convertedValue.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            System.out.println("Formatted time: " + formatedTime);
        } else if (value instanceof Integer) {
            System.out.println((String)((String) value).toUpperCase());
        }
    }
}
