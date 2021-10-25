package com.epam.glava_6.figure;

public class ActionMain {
    public static void main(String[] args) {
        ShapeAction action;
        try {
            Rectangle rectangleShape = new Rectangle(2, 5);
            action = new RectangleAction();

            System.out.println("Square rectangle: " + action.computeSquare(rectangleShape));
            System.out.println("Perimeter rectangle: " + action.computePerimeter(rectangleShape));

            RightTriangle rightTriangleShape = new RightTriangle(3,4);
            action = new TriangleAction();
            System.out.println("Square triangle: " + action.computeSquare(rightTriangleShape));
            System.out.println("Perimeter triangle: " + action.computePerimeter(rightTriangleShape));
            action.computePerimeter(rectangleShape);
        } catch (IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
