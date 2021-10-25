package com.epam.glava_10.readingFromStream;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class ReadStringMain3 {
    public static void main(String[] args) {
        Path path = Paths.get("data/res.txt");
        try(Stream<String> stream = Files.newBufferedReader(path).lines()) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
