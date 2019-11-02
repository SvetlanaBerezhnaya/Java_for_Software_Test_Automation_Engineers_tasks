package com.epam.task1;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%-17s%-14s", "class=" + this.getClass().getSimpleName() + ",", "color=" + this.getColor() + ",");
    }

    public double calcArea() {
        return 0;
    }

    public void view() {
        System.out.printf("%-58s%s%-7.2f%n", this.toString(), "area=", this.calcArea());
    }
}
