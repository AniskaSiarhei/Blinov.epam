package com.epam.glava_3;

public class OverloadMain {
    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArgCount(7, "No", true, null);
        printArgCount(i, i, i);
        printArgCount(i, 4, 42);
        printArgCount(i);
      //  printArgCount(42, 7);

    }

    public static void printArgCount(Object... arg) {
        System.out.println("Object arg: " + arg.length);
    }

    public static void printArgCount(Integer[]... arg) {
        System.out.println("Integer[] arg: " + arg.length);
    }

    public static void printArgCount(int... arg) {
        System.out.println("int arg: " + arg.length);
    }
}
