package com.epam.glava_8.regular;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("x+y");
        Matcher matcher = pattern.matcher("xxxy");
        boolean result = matcher.matches();
        System.out.println(result);

        String regex = "\\w{6,}@\\w+\\.\\p{Lower}{2,4}";
        String input = "адреса электронной почты: blinov@gmail.com, romanchik@bsu.by";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(input);
        while (matcher1.find()) {
            System.out.println("e-mail: " + matcher1.group());
        }

        String inputSrt = "java12;-lamda..[java9var";
        Pattern pattern2 = Pattern.compile("\\d+|\\p{Punct}+");
        String [] words = pattern2.split(inputSrt);
        System.out.println(Arrays.toString(words));

        Stream<String> stream = pattern2.splitAsStream(inputSrt);
        Pattern pattern3 = Pattern.compile("[^java]");
        stream.filter(pattern3.asPredicate()).forEach(System.out::println);


    }
}
