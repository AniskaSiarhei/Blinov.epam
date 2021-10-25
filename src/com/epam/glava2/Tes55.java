package com.epam.glava2;

import java.util.Arrays;

public class Tes55 {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d"};
        for (int i = 0; i < strings.length; i++) {
            strings[i] += "-JAVA";
        }
        System.out.println(Arrays.toString(strings));

// not work
//        for (String string: strings) {
//            strings += "SE";
//        }
    }
}
