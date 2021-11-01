package com.epam.glava_14;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressMain {
    public static void main(String[] args) {
        InetAddress currentIp;
        InetAddress epamIp;

        try {
            currentIp = InetAddress.getLocalHost();
            System.out.println("Current IP = " + currentIp);

            epamIp = InetAddress.getByName("epam.com");
            System.out.println("IP Epam.com = " + epamIp);



        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
