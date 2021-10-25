package com.epam.glava_10.readingFromStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadStringMain1 {
    public static void main(String[] args) {
        String dirName = "data";
        String fileName = "res.txt";
        Path path = FileSystems.getDefault().getPath(dirName, fileName);

        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
