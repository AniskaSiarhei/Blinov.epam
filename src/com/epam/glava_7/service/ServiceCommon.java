package com.epam.glava_7.service;

import com.epam.glava_7.service.function.Service;
import com.epam.glava_7.service.function.ServiceApp;

public interface ServiceCommon extends Service, ServiceApp {
    @Override
    default void anOperation() {
        System.out.println("necessary method implementation");
    }

    @Override
    default int define(int x1, int y1) {
        return 0;
    }

    @Override
    default void load() {

    }
}
