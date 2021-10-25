package com.epam.glava_10.scaner;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDelimiterMain {
    public static void main(String[] args) {
        double sum = 0.0;
        String numbersStr = "1,3;2,0; 8,5; 4,8;9,0; 1; 10;";
        Scanner scanner = new Scanner(numbersStr)
                .useLocale(Locale.CHINESE)
                .useDelimiter(";\\s*");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                System.out.println(scanner.next());
            }
        }
        System.out.println("SUM = " + sum);
        scanner.close();
    }
}
