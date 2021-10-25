package com.epam.glava_7.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> s2.length() - s1.length();

        String str = "and java course epam the rose lion wolf hero green white red white";
        Arrays.stream(str.split("\\s"))
                .sorted(comparator)
                .forEach(s -> System.out.printf("%s ", s));
    }
}
