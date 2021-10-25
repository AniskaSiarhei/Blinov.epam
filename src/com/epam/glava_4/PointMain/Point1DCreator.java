package com.epam.glava_4.PointMain;

import java.util.Random;

public class Point1DCreator {
    public Point1D create() {
        System.out.println("log in Point1DCreator");
        return new Point1D(new Random().nextInt(100));
    }
}
