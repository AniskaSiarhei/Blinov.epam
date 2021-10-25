package com.epam.glava_4.staticMethod;

public class StaticDumb {
    public static void go() {
        System.out.println("go() from StaticDumb");
    }
}
class StaticDumber extends StaticDumb{
    public static void go() {
        System.out.println("go() from StaticDumber");
    }

}
