package com.epam.glava_4.staticMethod;

public class StaticMain {
    public static void main(String[] args) {
        StaticDumb dumb = new StaticDumber();
        dumb.go();
        StaticDumber dumber = null;
        dumber.go();
    }
}
