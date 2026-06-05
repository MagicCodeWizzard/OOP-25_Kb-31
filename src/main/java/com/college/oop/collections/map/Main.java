package com.college.oop.collections.map;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = Map.of();

        Map<Integer, String> myMap1 =
            Map.of(23, "Hello", 34, "world", 45, "Hello");

        Map<Integer, String> myMap2 =
                Map.ofEntries(
                        Map.entry(1, "Hello"),
                        Map.entry(2, "Hello"),
                        Map.entry(3, "world")
                );
    }
}
