package com.epam.glava_10.iotest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class findAll {
    public static void main(String[] args) {
        Path pathStart = Paths.get("src");
        int maxDepth = 5;
        try (Stream<Path> pathStream = Files.walk(pathStart, maxDepth)) {
            pathStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
