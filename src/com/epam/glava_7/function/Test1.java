package com.epam.glava_7.function;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        Function<String, Integer> function1 = s -> s.length();
        Function<Integer, String> function2 = i -> Integer.toBinaryString(i);

        System.out.println(function1.apply("java"));
        System.out.println(function2.apply(20));
        String[] arrayStr = {"as", "a", "the", "d", "on", "and"};
        System.out.println(Arrays.stream(arrayStr)
                .map(function1)
                .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arrayStr)
                .map(s -> s.length())
                .collect(Collectors.toList()));

        Function<Integer, Integer> function3 = function1.compose(function2);
        System.out.println(function1.compose(function2).apply(17));

        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.stream(arrayInt)
                .boxed()
                .map(function1.compose(i -> Integer.toBinaryString(i)))
                .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arrayInt)
                .boxed()
                .map(((Function<String, Integer>) s -> s.length())
                        .compose(i -> Integer.toBinaryString(i)))
                .collect(Collectors.toList()));

        Function<String, String> function4 = function1.andThen(function2);
        // Function<String, String> function4 = function1.andThen(i -> Integer.toBinaryString(i));

        System.out.println(function1.andThen(function2).apply("Java"));

        System.out.println(Arrays.stream(arrayStr)
                .map(function1.andThen(i -> Integer.toBinaryString(i))).collect(Collectors.toList()));


    }
}
