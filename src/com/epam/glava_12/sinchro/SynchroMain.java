package com.epam.glava_12.sinchro;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SynchroMain {
    public static void main(String[] args) {
        try (CommonResourse resourse = new CommonResourse("data\\thread.txt")) {
            UseFileThread thread1 = new UseFileThread("First", resourse);
            UseFileThread thread2 = new UseFileThread("Second", resourse);
            thread1.start();
            thread2.start();
            TimeUnit.SECONDS.sleep(5);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
