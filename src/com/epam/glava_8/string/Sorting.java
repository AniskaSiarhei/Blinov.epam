package com.epam.glava_8.string;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String names = "  angela Alena    Agnes anette albina Anastasya     ALLA ArinA";
        names = names.strip();
        String namesArr[] = names.split(" ");
        System.out.println(Arrays.toString(namesArr));
        for (int i = 0; i < namesArr.length - 1; i++) {
            for (int j = i + 1; j < namesArr.length; j++) {
                if (namesArr[i].compareToIgnoreCase(namesArr[j]) < 0) {
                    String temp = namesArr[j];
                    namesArr[j] = namesArr[i];
                    namesArr[i] = temp;
                }
            }
        }
        for (String arg : namesArr) {
            if (!arg.isEmpty()) {
                System.out.print(arg + " ");
            }
        }

        Arrays.stream(namesArr)
                .filter(s -> !s.isEmpty())
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);

        String str = "    Java 14";
        str.codePoints()
                .filter(o -> o != ' ')
                .forEach(o -> System.out.print((char) o));

        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("    Java    14    ");
        stringBuilder.codePoints()
                .filter(o -> o != ' ')
                .forEach(o -> System.out.print((char) o));

    }
}
