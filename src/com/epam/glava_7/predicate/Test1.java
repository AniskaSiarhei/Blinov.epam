package com.epam.glava_7.predicate;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        String[] arraySrt = {"as", "a", "the", " ", "d", "on", "and", ""};
        System.out.println(Arrays.stream(arraySrt)
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arraySrt).anyMatch(String::isBlank));
        System.out.println(Arrays.stream(arraySrt).allMatch(String::isBlank));
        int[] arrayInt = {1, 3, 5, 9, 17, 33, 65};
        System.out.println(Arrays.stream(arrayInt).allMatch(i -> i % 2 != 0));

        Predicate<String> predicate1 = s -> s.contains("a");
        System.out.println(Arrays.stream(arraySrt)
                                    .filter(predicate1.and (s -> s.contains("n")))
                                    .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arraySrt)
                                    .filter(((Predicate<String>) s -> s.contains("a")).and(s -> s.contains("n")))
                                    .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arrayInt)
                                 .filter(((IntPredicate) i -> i > 32).or(i -> i < 4))
                                 .boxed()
                                 .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arraySrt)
        .filter(((Predicate<String>) s-> s.contains("and")).negate())
        .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arraySrt).filter(Predicate.not(s -> s.contains("and")))
        .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arraySrt)
        .filter(Predicate.isEqual("and"))
        .collect(Collectors.toList()));

        System.out.println(Arrays.stream(arraySrt)
                .filter(s -> s.equals("and"))
                .collect(Collectors.toList()));

        BiPredicate<String, Integer> biPredicate = (s, max) -> s.length() >= max;
        System.out.println(biPredicate.test("java", 7));
    }


}






