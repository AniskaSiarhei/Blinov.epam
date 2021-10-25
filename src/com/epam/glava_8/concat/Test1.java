package com.epam.glava_8.concat;

public class Test1 {
    public static void main(String[] args) {
        String s1= "Java";
        String s2 = "Ja" + "va" + "12";
        String s3 = new String("Java12");
        String s4 = new String(s1);

        System.out.println(s1 + " == " + s2 + " : " + (s1 == s2));
        System.out.println(s3 + " == " + s4 + " : " + (s3 == s4));
        System.out.println(s1 + " == " + s3 + " : " + (s1 == s3));
        System.out.println(s1 + " == " + s4 + " : " + (s1 == s4));
        System.out.println(s1 + " equals " + s2 + " : " + (s1.equals(s2)));
        System.out.println(s1 + " equals " + s3 + " : " + (s1.equals(s3)));
        System.out.println(s2 + " equals " + s3 + " : " + (s2.equals(s3)));

        String s5 = "Java";
        String s6 = new String("Java");
        System.out.println(s5 == s6);
        s6 = s6.intern();
        System.out.println(s5 == s6);
    }
}







