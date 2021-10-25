package com.epam.glava_3;

public class RecordMain {
    public static void main(String[] args) {
        ImmutableRec object = new ImmutableRec("Jan", 777);
        System.out.println(object.id());
        System.out.println(object.name());
        System.out.println(object.toString());
        ImmutableRec object2 = new ImmutableRec("Jan", 777);
        System.out.println(object.equals(object2));
    }
}

record ImmutableRec(String name, int id) {
    void method() {

    }
}

