package com.epam.glava_4.PointMain;

import java.util.Random;

public class Point2DCreator extends Point1DCreator {
    @Override
    public Point2D create() {
        System.out.println("log in Point2DCreator");
        Random random = new Random();
        return new Point2D(random.nextInt(10), random.nextInt(10));
    }
}
