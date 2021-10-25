package com.epam.glava_10.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputMain {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("src/com/epam/glava_10/iotest/info1.txt")) {
            int code = inputStream.read();
            System.out.println(code + " char = " + (char)code);

            byte[] arrayByte = new byte[16];
            int numberBytes = inputStream.read(arrayByte);
            System.out.println("numberBytes = " + numberBytes);
            System.out.println(Arrays.toString(arrayByte));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
