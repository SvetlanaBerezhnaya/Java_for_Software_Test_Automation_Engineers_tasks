package com.epam.task1;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return super.toString() + "a=" + this.getA() + ", b=" + this.getB() + ", c=" + this.getC() + ",";
    }

    @Override
    public double calcArea() {
        double p = (this.getA() + this.getB() + this.getC()) / 2;
        return Math.sqrt(p * (p - this.getA()) * (p - this.getB()) * (p - this.getC()));
    }
}
