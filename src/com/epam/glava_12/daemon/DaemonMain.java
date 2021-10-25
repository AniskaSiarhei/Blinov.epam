package com.epam.glava_12.daemon;

public class DaemonMain {
    public static void main(String[] args) {
        SimpleThread normal = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        normal.start();
        daemon.start();
        System.out.println("end of main");
    }
}
