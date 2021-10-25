package com.epam.glava_12.time;

import java.util.Timer;

public class TimerMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimeCounter(), 100, 3000);
    }
}
