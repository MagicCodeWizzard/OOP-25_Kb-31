package com.college.oop.polymorhysm;

import com.college.oop.polymorhysm.controller.ObjectRenderer;
import com.college.oop.polymorhysm.model.Hexagon;
import com.college.oop.polymorhysm.model.Polygon;
import com.college.oop.polymorhysm.model.Square;
import com.college.oop.polymorhysm.model.Triangle;

public class Main {
    public static void main(String[] args) {

        Hexagon hex = new Hexagon(new int[]{5,5,5,5,5,5}, "BLACK");
        Square square = new Square(5,"YELLOW");
        Triangle triangle = new Triangle(new int[]{10, 10, 4}, "RED");

        ObjectRenderer rendered = new ObjectRenderer();

        Polygon poly1 = hex;
        Polygon poly2 = square;
        Polygon poly3 = triangle;

        rendered.render(hex);
        rendered.render(square);
        rendered.render(triangle);
    }
}
