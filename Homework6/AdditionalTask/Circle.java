package com.epam.task1;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s", "radius=" + this.getRadius() + ",");
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
