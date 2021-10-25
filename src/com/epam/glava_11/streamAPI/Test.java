package com.epam.glava_11.streamAPI;

import com.epam.glava_11.iterators.OrderType;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> strings = List.of("as a the d on and".split("\\s+"));

        strings.stream()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        strings.stream()
                .filter(s -> s.length() < 2)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        strings.stream()
                .map(s -> s.length())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        strings.stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        OrderType type1 = new OrderType(771);
        type1.add("SEK");
        type1.add("DKK");
        type1.add("NOK");
        type1.add("EUR");
        OrderType type2 = new OrderType(779);
        type2.add("SEK");
        type2.add("PLN");
        type2.add("CZK");
        type2.add("EUR");
        List<OrderType> orderTypes = List.of(type1, type2);
        List<String> currencyList = orderTypes.stream()
                .map(o -> o.getCurrencyNames())
                .flatMap(o -> o.stream())
                .collect(Collectors.toList());
        System.out.println(currencyList);

        strings.stream()
                .map(s ->s.length())
                .peek(s -> System.out.print(s + "-"))
                .map(n -> n + 100)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        strings.stream()
             //   .map(s -> s.length())
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        strings.stream()
          //      .sorted((s1, s2) -> s1.length() - s2.length())
                .sorted((s1, s2) -> s2.length() - s1.length())
         //       .sorted(Comparator.comparingInt(String::length))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        strings.stream()
                .limit(3)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        strings.stream()
                .skip(4)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        List<String> stringsDouble = List.of("the and the and the and a".split("\\s+"));
        stringsDouble.stream()
                .distinct()
              //  .map(s -> s.length())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        String firtStr = strings.stream()
                .filter(s -> s.matches("a\\w*"))
                .findFirst()
                .orElse("none");
        System.out.println(firtStr);

        String anyStr = strings.stream()
                .filter(s -> s.matches("an[a-z]"))
                .findAny()
                .orElse("none");
        System.out.println(anyStr);

        long count = strings.stream()
                .filter(s->s.matches("a\\w*"))
                .count();
        System.out.println(count);

        boolean res1 = strings.stream()
                .allMatch(s-> s.length() < 5);
        System.out.println(res1);

        boolean res2 = strings.stream()
                .anyMatch(s -> s.startsWith("a"));
        System.out.println(res2);

        boolean res3 = strings.stream()
                .noneMatch(s -> s.endsWith("z"));
        System.out.println(res3);

        int sumLength = strings.stream()
                .map(s -> s.length())
                .reduce(0, (o1, o2) -> o1 + o2);
        System.out.println(sumLength);

        int sum = strings.stream()
                .reduce(0, (identity, v) -> v.length() + identity, Integer::sum);
        System.out.println(sum);

        Map<String, Integer> map = Arrays.stream("as a the d on and".split("\\s+"))
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(map);

        String min = strings.stream()
                .min(Comparator.comparingInt(s -> s.charAt(s.length() - 1)))
                .orElse("none");
        System.out.println(min);

        String max = strings.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("empty");
        System.out.println(max);



    }
}
