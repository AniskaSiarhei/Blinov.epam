package com.epam.glava_6.generic;

public class TriangleGeneric implements ShapeGeneric<RightTriangle> {
    @Override
    public double computeSqure(RightTriangle shape) {
        return 0.5 * shape.getSideA() * shape.getSideB();
    }

    @Override
    public double computePerimeter(RightTriangle shape) {
        double a = shape.getSideA();
        double b = shape.getSideB();
        double perimeter = a + b + Math.hypot(a, b);
        return perimeter;
    }
}
