package com.epam.glava_3;

public class DemoVarargMain {
    public static void main(String[] args) {
        System.out.println("N = " + defineArgCount(7, 42, 555));
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("N = " + defineArgCount(arr));
        System.out.println(defineArgCount());

    }

    public static int defineArgCount(Integer... arg) {
        if (arg.length != 0) {
            for (int element : arg) {
                System.out.printf("arg:%d ", element);
            }
        } else {
            System.out.print("NO ARG! N = ");
        }
        return arg.length;
    }
}
