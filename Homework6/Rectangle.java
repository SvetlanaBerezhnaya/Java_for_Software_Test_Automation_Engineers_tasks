package com.epam.task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s%-12s", "width=" + this.getWidth() + ",", "height=" + this.getHeight() + ",");
    }

    @Override
    public double calcArea() {
        return this.getWidth() * this.getHeight();
    }
}
