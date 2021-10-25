package com.epam.glava_12.threads;

public class BaseThreadMain {
    public static void main(String[] args) {
        WalkThread walkThread = new WalkThread();
        Thread talkThread = new Thread(new TalkThread());
        talkThread.start();
        walkThread.start();
    }
}
