package com.epam.glava_14.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {
    private PrintStream printStream;
    private BufferedReader reader;
    private InetAddress address;

    public ServerThread(Socket socket) {
        try {
            printStream = new PrintStream(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        address = socket.getInetAddress();
    }

    @Override
    public void run() {
        int counter = 0;
        String message;
        try {
            while ((message = reader.readLine()) != null) {
                if ("PING".equals(message)) {
                    printStream.println("PONG # " + ++counter);
                }
                System.out.println("PING-PONG # " + counter + " from " + address.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            {
                disconnect();
            }
        }
    }

    private void disconnect() {
        if (printStream != null) {
            printStream.close();
        }
        try {
            if (reader != null) {
                reader.close();
            }
            System.out.println(address.getHostName() + ": disconnected!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
