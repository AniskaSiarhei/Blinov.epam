package com.epam.glava_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLInfoDocumentationMain {
    public static void main(String[] args) {
        String urlName = "https://logging.apache.org/log4j/2.x/download.html";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(urlName).openStream()))) {
            URL url = new URL(urlName);
            System.out.println("protocol : " + url.getProtocol());
            System.out.println("host : " + url.getHost());
            System.out.println("port : " + url.getDefaultPort());
            System.out.println("file : " + url.getFile());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
