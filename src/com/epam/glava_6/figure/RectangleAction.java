package com.epam.glava_6.figure;

public class RectangleAction implements ShapeAction{
    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimetr;
        if (shape instanceof Rectangle rectangle) {
            perimetr = 2 * (rectangle.getWidth() + rectangle.getHeight());
        } else {
            throw new IllegalArgumentException("Incompatible shape " + shape.getClass());
        }
        return perimetr;
    }

    @Override
    public double computeSquare(AbstractShape shape) {
        double square;
        if (shape instanceof Rectangle rectangle) {
            square = rectangle.getHeight() * rectangle.getWidth();
        } else {
            throw new IllegalArgumentException("Incompatible shape " + shape.getClass());
        }
        return square;
    }
}

















