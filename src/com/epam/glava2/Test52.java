package com.epam.glava2;

import java.util.Locale;

public class Test52 {
    public static void main(String[] args) {
        System.out.println(defineLevel("AdmiN"));
    }

    public static int defineLevel(String role) {
        int level;

        switch (role.toLowerCase(Locale.ROOT)) {
            case "guest":
                level = 0;
                break;
            case "client":
                level = 1;
                break;
            case "moderator":
                level = 2;
                break;
            case "admin":
                level = 3;
                break;
            default:
                throw new IllegalArgumentException("non-authentic role = " + role);
        }
        return level;
    }
}
