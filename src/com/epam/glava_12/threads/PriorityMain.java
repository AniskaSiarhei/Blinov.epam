package com.epam.glava_12.threads;

public class PriorityMain {
    public static void main(String[] args) {
        Thread walkMin = new Thread(new WalkThread(), "MIN");
        Thread talkMax = new Thread(new TalkThread(), "MAX");
        walkMin.setPriority(Thread.MIN_PRIORITY);
        talkMax.setPriority(Thread.MAX_PRIORITY);
        walkMin.start();
        talkMax.start();

    }
}
