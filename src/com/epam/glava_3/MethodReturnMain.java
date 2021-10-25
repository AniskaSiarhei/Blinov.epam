package com.epam.glava_3;

import java.util.ArrayList;
import java.util.List;

public class MethodReturnMain {
    public static void main(String[] args) {
        MethodAction methodAction = new MethodAction();
        int number = 739_015_428;
        ArrayList<Integer> result = new ArrayList<>();
        int length = methodAction.numberParseInt(number, result);
        System.out.println(length);
//        for (int i = 0; i < length; i++) {
//            System.out.printf("%d ", result[i]);
//        }
        System.out.println(result.toString());
    }
}

class MethodAction {
    public int numberParseInt(int number, ArrayList<Integer> numbers) {
        String str = String.valueOf(number);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char code = str.charAt(i);
            int n = Character.digit(code, 10);
            numbers.add(n);
        }
        return length;
    }
}
