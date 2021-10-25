package com.epam.glava_10.archiv;

import java.io.FileNotFoundException;

public class PackMain {
    public static void main(String[] args) {
        String dirName = "data";

        try {
            PackJar packJar = new PackJar("example.jar");
            packJar.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
