package com.epam.task1;

public class Main {

    public static Shape[] initShapes() {
        Shape[] shapes = {
                new Rectangle("Green", 8, 5),
                new Rectangle("Blue", 6.25, 4),
                new Rectangle("Red", 12, 7.5),
                new Rectangle("Black", 8.75, 5),
                new Circle("Yellow", 10.75),
                new Circle("Red", 7.5),
                new Circle("Blue", 8),
                new Triangle("Green", 4, 5, 6),
                new Triangle("Yellow", 8, 10, 12)
        };
        return shapes;
    }

    public static void viewShapes(Shape[] shapes) {
        for (Shape shape : shapes)
            shape.view();
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes)
            totalArea += shape.calcArea();
        return totalArea;
    }

    public static double calculateTotalAreaOfShape(Shape[] shapes, String shapesStr) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            if ((shapesStr == "circles" && shape instanceof Circle) ||
                    (shapesStr == "rectangles" && shape instanceof Rectangle) ||
                    (shapesStr == "triangles" && shape instanceof Triangle))
                totalArea += shape.calcArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        Shape[] shapes = initShapes();
        viewShapes(shapes);
        System.out.printf("%s%-7.2f%n", "Total area of all shapes: ", calculateTotalArea(shapes));
        String shapesStr = "circles";
        System.out.printf("%s%-7.2f%n", "Total area of all " + shapesStr + ": ", calculateTotalAreaOfShape(shapes, shapesStr));
    }
}
