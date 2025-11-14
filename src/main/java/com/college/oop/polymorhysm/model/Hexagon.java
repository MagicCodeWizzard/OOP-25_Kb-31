package com.college.oop.polymorhysm.model;

public class Hexagon extends Polygon {

    public Hexagon() {
        super(new int[]{0, 0, 0, 0, 0, 0}, "NO_COLOR");
    }

    public Hexagon(int[] sides, String color) {
        super(sides, color);

        if (sides.length < 6) {
            throw new IllegalArgumentException("Hexagon can own 6 sides!");
        }
    }

    @Override
    public void cleanup() {
        System.out.printf("%n+++++%nClean up th hexagon%n++++++%n");
    }
}
