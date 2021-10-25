package com.epam.glava2;

import java.util.Locale;

public class Test53 {
    public static void main(String[] args) {
        System.out.println(defineLevel1("Admin"));
        System.out.println(defineLevel2("Admin"));

        int value = 1;
        switch (value) {
            case 1, 2, 3, 4 -> System.out.println("1, 2, 3 or 4");
            case 777 -> System.out.println("Range: " + value);
            case 0 -> System.out.println("0");
            default -> System.out.println("DEFAULT");
        }

        System.out.println(
                switch (value) {
                    case 2, 3, 4 -> "2, 3 or 4";
                    case 777 -> "Range: " + value;
                    case 0 -> "0";
                    default -> "DEFAULT";
                }
        );
    }

    public static int defineLevel1(String role) {
        return switch (role.toLowerCase(Locale.ROOT)) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("no-authentic role = " + role);
                yield -1;
            }
        };
    }

    public static int defineLevel2(String role) {
        var result = switch (role.toLowerCase(Locale.ROOT)) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moerator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }


}
