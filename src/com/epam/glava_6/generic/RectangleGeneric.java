package com.epam.glava_6.generic;

public class RectangleGeneric implements ShapeGeneric<Rectangle>{
    @Override
    public double computeSqure(Rectangle shape) {
        return shape.getHeight() * shape.getWidth();
    }

    @Override
    public double computePerimeter(Rectangle shape) {
        return 2 * (shape.getWidth() + shape.getHeight());
    }
}
