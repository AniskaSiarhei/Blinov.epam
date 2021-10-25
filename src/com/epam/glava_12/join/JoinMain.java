package com.epam.glava_12.join;

import com.sun.security.jgss.GSSUtil;

import java.util.concurrent.TimeUnit;

public class JoinMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("START-1");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("END-1");
        }).start();

        JoinThread thread = new JoinThread();
        thread.start();
        try {
            thread.join(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of " + Thread.currentThread().getName());
    }
}
