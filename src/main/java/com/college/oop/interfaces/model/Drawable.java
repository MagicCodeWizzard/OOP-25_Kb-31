package com.college.oop.interfaces.model;

public interface Drawable {
    int MINIMUM_POINT_SIZE = 3;

    void preDraw();
    void draw();
    void clear();

    default void delete() {
        System.out.println("Object will be deleted!");
    }
}
