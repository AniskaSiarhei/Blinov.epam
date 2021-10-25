package com.epam.glava2;

public class Test32 {
    public static void main(String[] args) {
        byte b = 42;
        int i = 1;
        b += i++; // ok!
        b += 1000; // ok

        var counter = 1;
        var name = new String();


        System.out.println(counter);
    }
}

