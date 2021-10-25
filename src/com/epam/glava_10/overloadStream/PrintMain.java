package com.epam.glava_10.overloadStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintMain {
    public static void main(String[] args) {
        double[] values = {1.10, 1.2};
        try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("data/r.txt")))){
            for (double value: values) {
                printWriter.printf("java %.2g%n",value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
