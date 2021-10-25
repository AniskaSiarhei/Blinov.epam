package com.epam.glava2;

import java.math.BigDecimal;
import java.math.MathContext;

public class Test46 {
    public static void main(String[] args) {
        int value = 42;

        String good1 = Integer.toString(value);
        String good2 = String.valueOf(value);
        String bad = "" + value;
        System.out.println(good1 + " " + good2 + " " + bad);

        Float f = 42f;

//        Integer j = null; // the object is not instantiated ! This is not zero!
//        int i = j; // generating an exception at runtime

        int i = 127;
        Integer a = i; // autoboxing
        Integer b = i;
        System.out.println("a==i " + (a == i)); // true – unboxing and comparing values
        System.out.println("b==i " + (b == i)); // true
        System.out.println("a==b " + (a == b)); // false - references to different objects
        System.out.println("equals -> " + a.equals(i) + " " +b.equals(i) + " " + a.equals(b)); // true true true

        float res = 0.4f - 0.3f;
        System.out.println(res);
        BigDecimal big1 = new BigDecimal("0.4");
        BigDecimal big2 = new BigDecimal("0.3");
        BigDecimal bigRes = big1.subtract(big2, MathContext.DECIMAL32);
        System.out.println(bigRes);

        boolean res1 = 1.00000001f == 1.00000002f;
        System.out.println(res1);
        boolean res2 = 1 == 1f / 3 * 3;
        System.out.println(res2);
    }
}
