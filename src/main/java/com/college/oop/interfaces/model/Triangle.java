package com.college.oop.interfaces.model;

public class Triangle extends Polygon {

    public Triangle() {
    }

    public Triangle(int[] sides, String color) {
        super(sides, color);

        if (sides.length != 3) {
            throw new IllegalArgumentException("Triangle can be only with 3 sides!");
        }
    }

    @Override
    public void clear() {
        System.out.printf("%n+++++%nClean up th triangle%n++++++%n");
    }

    @Override
    public void preDraw() {

    }
}
