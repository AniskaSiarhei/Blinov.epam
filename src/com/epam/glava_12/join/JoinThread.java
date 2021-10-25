package com.epam.glava_12.join;

import java.util.concurrent.TimeUnit;

public class JoinThread extends Thread{
    @Override
    public void run() {
        System.out.println("Start");
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END");
    }
}
