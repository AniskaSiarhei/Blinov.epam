package com.epam.glava2;

public class Test45 {
    public static void main(String[] args) {
        try {
            String arg = "42";
            int value1 = Integer.parseInt(arg);
            System.out.println(value1);
            Integer value2 = Integer.decode(arg);
            System.out.println(value2);
            int value3 = Integer.valueOf(arg, 16);
            System.out.println(value3);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + args + ": " + e);
        }

    }
}
