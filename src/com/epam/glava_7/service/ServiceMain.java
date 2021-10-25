package com.epam.glava_7.service;

import com.epam.glava_7.service.function.Service;

public class ServiceMain {
    public static void main(String[] args) {
        Service.action();

        ServiceImp serviceImp = new ServiceImp();
        System.out.println(serviceImp.define(1,2));
        serviceImp.load();
        serviceImp.anOperation();

    }
}
