package com.epam.glava_7.service;

import com.epam.glava_7.service.function.Service;

public class ServiceImp implements Service {
    @Override
    public int define(int x, int y) {
        return x + y;
    }

    @Override
    public void load() {
        System.out.println("load() in ServiceImp");
    }
}
