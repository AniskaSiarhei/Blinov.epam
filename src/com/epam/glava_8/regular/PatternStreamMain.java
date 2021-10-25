package com.epam.glava_8.regular;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PatternStreamMain {
    public static void main(String[] args) {
        String[] arrayStr = {"12.9", "44", "the", "7,1", "27..2", "211"};
        List<Integer> list = Arrays.stream(arrayStr)
                .flatMap(Pattern.compile("\\D+")::splitAsStream)
                .peek((s -> System.out.printf(" %s ", s )))
                .filter(Pattern.compile("[2-9]+").asPredicate())
                .map(Integer::valueOf)
                .collect(Collectors.toList());Collectors.toList();

        System.out.println("\n" + list);
    }
}
