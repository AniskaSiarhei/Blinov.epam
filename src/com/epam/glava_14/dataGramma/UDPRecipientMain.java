package com.epam.glava_14.dataGramma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPRecipientMain {
    final static int WAIT_TIMEOUT = 60_000;

    public static void main(String[] args) {
        File file = new File("C:/tmp/project2.zip");
        System.out.println("receiving data ....");
        acceptFile(file, 8033, 1024);
        System.out.println("data reception completed");
    }
    private static void acceptFile(File file, int port, int pacSize) {
        byte data[] = new byte[pacSize];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            DatagramSocket datagramSocket = new DatagramSocket(port);
            datagramSocket.setSoTimeout(WAIT_TIMEOUT);
            while (true) {
                datagramSocket.receive(packet);
                outputStream.write(data);
                outputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
