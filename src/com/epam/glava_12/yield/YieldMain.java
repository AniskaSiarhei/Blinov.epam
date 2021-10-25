package com.epam.glava_12.yield;

public class YieldMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("start 1");
            Thread.yield();
            Thread.yield();
            System.out.println("end 1");
        }).start();
        new Thread(() -> {
            System.out.println("start 2");
            System.out.println("end 2");
        }).start();
    }
}
