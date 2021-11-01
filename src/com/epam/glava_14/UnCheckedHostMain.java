package com.epam.glava_14;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UnCheckedHostMain {
    public static void main(String[] args) {
        byte[] ip = {(byte) 98, (byte) 21, (byte) 58, (byte) 3};
        try {
            InetAddress address = InetAddress.getByAddress("bsu.by", ip);
            System.out.println(address.getHostName() + " -> connection: " + address.isReachable(1_000));



        } catch (UnknownHostException e) {
            System.out.println("address unavailable: " + e);;
        } catch (IOException e) {
            System.err.println("I/O exception : " + e);;
        }
    }
}
