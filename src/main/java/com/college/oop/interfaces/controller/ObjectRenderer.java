package com.college.oop.interfaces.controller;

import com.college.oop.interfaces.model.Drawable;

public class ObjectRenderer {
    public void render(Drawable object) {
        object.clear();
        object.preDraw();
        object.draw();
    }
}
