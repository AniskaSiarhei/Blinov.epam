package com.epam.glava_10.iotest;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class FileMain {
    public static void main(String[] args) {
        File file = new File("data" + File.separator + "info.txt");
        if (file.exists() && file.isFile()) {
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length());
            System.out.println("Dir: " + file.getParent());
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("------------------------");
        File dir = new File("src");
        if (dir.exists() && dir.isDirectory()){
            for (File current : dir.listFiles()) {
                long millis = current.lastModified();
                Instant date = Instant.ofEpochMilli(millis);
                System.out.println(current.getPath() + "\t" + "size: "+ current.length() + "\t" + "Data create: " +date);
            }
        }
        File root = File.listRoots()[0];
        System.out.printf("\n%s %,d from %,d free bytes", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
    }
}






