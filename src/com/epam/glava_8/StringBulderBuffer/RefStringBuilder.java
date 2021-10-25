package com.epam.glava_8.StringBulderBuffer;

public class RefStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Oracle");
        changeStringBuilder(stringBuilder);
        System.out.println(stringBuilder);
    }
    public static void changeStringBuilder(StringBuilder builder) {
        builder.append(" Certified");
    }
}
