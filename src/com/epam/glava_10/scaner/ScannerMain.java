package com.epam.glava_10.scaner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        String fileName = "data/scan.txt";
        try(Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    System.out.println(scanner.nextInt() + " :int");
                } else if (scanner.hasNextBoolean()) {
                    System.out.println(scanner.nextBoolean() + " :boolean");
                } else if (scanner.hasNextDouble()) {
                    System.out.println(scanner.nextDouble() + " :double");
                } else {
                    System.out.println(scanner.next() + " :String");
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
