package com.epam.glava_12.daemon;

import java.util.concurrent.TimeUnit;

public class SimpleThread  extends Thread{
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("start of daemon thread");
                TimeUnit.MILLISECONDS.sleep(10);
            } else {
                System.out.println("start of normal thread");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            {
                if (!isDaemon()) {
                    System.out.println("normal thread completion");
                } else {
                    System.out.println("daemon thread completion");
                }
            }
        }
    }
}
