package com.epam.glava_8.StringBulderBuffer;

public class Equals {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();

        stringBuffer1.append("Java");
        stringBuffer2.append("Java");

        System.out.println(stringBuffer1 == stringBuffer2);
        System.out.println(stringBuffer1.equals(stringBuffer2));
        System.out.println(stringBuffer1.hashCode() == stringBuffer2.hashCode());
        System.out.println(stringBuffer1.toString().equals(stringBuffer2.toString()));
        System.out.println(stringBuffer1.toString().contentEquals(stringBuffer2));
    }
}
