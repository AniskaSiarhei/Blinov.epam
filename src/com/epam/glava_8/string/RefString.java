package com.epam.glava_8.string;

public class RefString {
    public static void changeString(String str) {
        str.concat(" Certificated!");
        str = str.concat(" Certificated!");
        str += "Certificated";
        return;
    }

    public static void main(String[] args) {
        String str = new String("Java");
        changeString(str);
        System.out.println(str);
    }
}
