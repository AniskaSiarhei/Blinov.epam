package com.epam.glava_7.consume;

import com.epam.glava_6.generic.RightTriangle;

import java.util.Arrays;

public class ConsumerMain {
    public static void main(String[] args) {
        RightTriangle[] triangles = {new RightTriangle(1, 2), new RightTriangle(3, 4)};
        Arrays.stream(triangles)
                .forEach(t -> t.setSideA(t.getSideA() * 10));
        System.out.println(Arrays.toString(triangles));
    }
}
