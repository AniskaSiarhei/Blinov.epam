package com.epam.glava_7.service;

import com.epam.glava_7.service.function.Service;
import com.epam.glava_7.service.function.ServiceApp;

public class ServiceTwoImp implements Service, ServiceApp {
    @Override
    public void anOperation() {
        System.out.println("necessary method implementation");
    }

    @Override
    public int define(int x, int y) {
        return x - y;
    }

    @Override
    public void load() {

    }
}
