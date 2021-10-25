package com.epam.glava_7.service.function;

public interface ServiceApp {
    default void anOperation() {
        System.out.println("Service anOperation!");
    }
}
