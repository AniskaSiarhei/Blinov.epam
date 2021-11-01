package com.epam.glava_14.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServerThreadMain {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8071);
            System.out.println(serverSocket.getInetAddress() + " server STARTED! ");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress().getHostName() + " connected!");
                ServerThread thread = new ServerThread(socket);
                thread.run();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
