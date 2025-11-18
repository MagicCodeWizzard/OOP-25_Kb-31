package com.college.oop.interfaces;

import com.college.oop.interfaces.model.Drawable;
import com.college.oop.interfaces.model.Square;
import com.college.oop.interfaces.controller.ObjectRenderer;

public class Main {
    public static void main(String[] args) {
        Drawable drawable = new Square(5, "RED");

        ObjectRenderer renderer = new ObjectRenderer();
        renderer.render(drawable);
        drawable.delete();

        System.out.println(Drawable.MINIMUM_POINT_SIZE);
    }


}
