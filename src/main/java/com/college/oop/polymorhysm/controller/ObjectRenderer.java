package com.college.oop.polymorhysm.controller;

import com.college.oop.polymorhysm.model.Polygon;

public class ObjectRenderer {
    public void render(Polygon polygon) {
        polygon.cleanup();
        polygon.draw();
    }
}
