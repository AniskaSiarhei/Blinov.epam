package com.epam.glava_6.figure;

public class TriangleAction implements ShapeAction{
    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimetr = 0;
        if (shape instanceof RightTriangle triangle) {
            double a = triangle.getSideA();
            double b = triangle.getSideB();
            perimetr = a + b + Math.hypot(a, b);
        } else {
            throw new IllegalArgumentException("Incompatible shape "  + shape.getClass());
        }
        return perimetr;

    }

    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof RightTriangle triangle) {
            square = 1./2 * triangle.getSideA() * triangle.getSideB();
        } else {
            throw new IllegalArgumentException("Incompatible shape " + shape.getClass());
        }
        return square;
    }
}















