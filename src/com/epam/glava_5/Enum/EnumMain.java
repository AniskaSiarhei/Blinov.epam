package com.epam.glava_5.Enum;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
        Arrays.stream(Shape.values()).forEach(s -> System.out.println(s.computeSquare()));
    }
}
