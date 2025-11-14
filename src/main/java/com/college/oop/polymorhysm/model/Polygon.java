package com.college.oop.polymorhysm.model;

import java.util.Arrays;

public abstract class Polygon {
    private int[] sides;
    private String color;

    public Polygon() {
        sides = new int[]{0, 0, 0 };
        color = "NO_COLOR";
    }

    public Polygon(int[] sides, String color) {
        if (sides == null || sides.length < 3) {
            throw new IllegalArgumentException("Invalid sides");
        }

        this.sides = sides;
        this.color = color;
    }

    public int[] getSides() {
        return sides;
    }

    public void setSides(int[] sides) {
        this.sides = sides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfVertices() {
        return sides.length;
    }

    public void draw() {
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.printf("Some shape (%d vertices) of %s will be rendered%n", getNumberOfVertices(), Arrays.toString(sides));
        System.out.println("++++++++++++++++++++++++++++++++");
    }

    public abstract void cleanup();
}
