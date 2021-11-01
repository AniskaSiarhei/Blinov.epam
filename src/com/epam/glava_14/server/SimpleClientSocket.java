package com.epam.glava_14.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClientSocket {
    public static void main(String[] args) {
        try(Socket socket = new Socket(InetAddress.getLocalHost(), 2048);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String message = reader.readLine();
            System.out.println("message received: " + message);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("client is closed!");
    }
}
