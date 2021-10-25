package com.epam.glava_7.service.function;

public interface Service {
    default void anOperation() {
        System.out.println("Service anOperation!");
        this.method();
    }

    private void method() {
        System.out.println("private method in Service!");
    }

    static void action() {
        System.out.println("Service static action");
    }
    int define(int x1, int y1);
    void load();
}
