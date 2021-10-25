package com.epam.glava_8.string;

public class Strip {
    public static void main(String[] args) {
        String str1 = "     " + null + "   4" + 5 * 11;
        System.out.println(str1);
        str1 = str1.strip();
        System.out.println(str1);

        String str3 = String.join("-", "java", "14", "SE");
        System.out.println(str3);
    }
}
