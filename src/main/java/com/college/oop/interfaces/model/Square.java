package com.college.oop.interfaces.model;

public class Square extends Polygon {

    public Square() {
        super(new int[]{0, 0, 0, 0}, "NO_COLOR");
    }

    public Square(int height, String color) {
        super(new int[]{height, height, height, height}, color);
    }

    @Override
    public void preDraw() {
        System.out.println("Підготовка до візуалізації");
    }

    public void draw() {
        for (int width = 0; width < this.getSides()[0]; width++) {
            for (int height = 0; height < this.getSides()[0]; height++){
                boolean isWidth = width == 0 || width == this.getSides()[0] - 1;
                boolean isHeight = height == 0 || height == this.getSides()[0] - 1;
                if (isWidth || isHeight) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.printf("%n");
        }
    }

    @Override
    public void clear() {
        System.out.printf("%n+++++%nClean up th square%n++++++%n");
    }

    @Override
    public void delete() {
        super.delete();
    }
}
