package com.epam.glava_10.archiv;

public class UnPackMain {
    public static void main(String[] args) {
        String nameJar = "example.jar";
        String destinationPath = "c:\\tmp\\";
        new UnPackJar().unpack(destinationPath, nameJar);
    }
}
