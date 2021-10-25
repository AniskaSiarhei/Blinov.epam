package com.epam.glava_6.generic;

public interface ShapeGeneric <T extends AbstractShape> {
    double computeSqure(T shape);
    double computePerimeter(T shape);

}
