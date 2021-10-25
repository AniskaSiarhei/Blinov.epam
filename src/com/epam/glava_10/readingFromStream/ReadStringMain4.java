package com.epam.glava_10.readingFromStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadStringMain4 {
    public static void main(String[] args) {
        Path path = Paths.get("data/res.txt");
        try(Stream<String> stream = Files.lines(path)) {
            String result = stream.collect(Collectors.joining());
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
