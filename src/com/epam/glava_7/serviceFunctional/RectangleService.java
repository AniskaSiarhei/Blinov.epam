package com.epam.glava_7.serviceFunctional;

public class RectangleService implements ShapeService{

        ShapeService rectangleService = (a,  b) ->  2 * (a + b);

    @Override
    public double perimeter(double a, double b) {
        return 0;
    }
};
