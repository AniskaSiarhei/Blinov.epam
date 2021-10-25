package com.epam.glava_12.threads;

public class WalkThread extends Thread{
//    public static void main(String[] args) {
//        new WalkThread().run();
//    }

    public void run() {
        try{
            for (int i = 0; i < 7; i++) {
                System.out.println("Walk " + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
