package com.epam.glava_10.iotest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutMain {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/com/epam/glava_10/iotest/infoOut.txt")) {
          //  fileOutputStream.write(48);
            byte[] value = {32, 50, 32, 51, 32, 52, 32, 53, 32, 54, 32, 55, 32, 56, 32, 57};
            fileOutputStream.write(value);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



