package com.epam.glava_12.exceptions;

import java.util.concurrent.TimeUnit;

public class ThreadExceptionMain2 {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end of Thread");
        }).start();
        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Boolean.TRUE) {
            throw new RuntimeException();
        }
        System.out.println("end of main main");
    }
}
