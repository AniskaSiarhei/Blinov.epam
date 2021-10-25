package com.epam.glava_10.overloadStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintMain2 {
    public static void main(String[] args) {
        double[] values = {14.10, 17};
        try (PrintStream stream = new PrintStream(new FileOutputStream("data/res.txt"))) {
            for (double value : values) {
                stream.printf("Java %.2g%n", value);
                System.setOut(stream);
                System.out.printf("%.2g%n",value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
