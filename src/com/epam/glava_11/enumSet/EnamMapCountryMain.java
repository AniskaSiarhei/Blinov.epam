package com.epam.glava_11.enumSet;

import java.util.EnumMap;

public class EnamMapCountryMain {
    public static void main(String[] args) {
        EnumMap<Country, Integer> map = new EnumMap<Country, Integer>(Country.class);
        map.put(Country.POLAND, 8);
        map.put(Country.UKRAINE, 1);
        map.put(Country.BELARUS, 0);
        map.forEach((v, k) -> System.out.println(k + " " + v));

    }
}
