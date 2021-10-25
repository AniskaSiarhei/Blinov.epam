package com.epam.glava_11.enumSet;

import java.util.EnumSet;

import static com.epam.glava_11.enumSet.Country.*;

public class EnumSetCountryMain {
    public static void main(String[] args) {
        EnumSet<Country> asiaCountries = EnumSet.of(ARMENIA, INDIA, KAZAKHSTAN);
        String nameCountry = "Belarus";
        Country current = Country.valueOf(nameCountry.toUpperCase());
        if (asiaCountries.contains(current)) {
            System.out.println(current + " is in Asia");
        } else {
            System.out.println(current + " is not in Asia");
        }
    }
}
