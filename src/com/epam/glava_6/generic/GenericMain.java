package com.epam.glava_6.generic;

public class GenericMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        ShapeGeneric<Rectangle> rectangleShapeGeneric = new RectangleGeneric();
        RightTriangle triangle = new RightTriangle(3,4);
        ShapeGeneric<RightTriangle> triangleShapeGeneric = new TriangleGeneric();
        System.out.println("Square rectangle: " + rectangleShapeGeneric.computeSqure(rectangle));
        System.out.println("Perimeter rectangle: " + rectangleShapeGeneric.computePerimeter(rectangle));
        System.out.println("Square triangle: " + triangleShapeGeneric.computeSqure(triangle));
        System.out.println("Perimeter triangle: " + triangleShapeGeneric.computePerimeter(triangle));

    }
}
