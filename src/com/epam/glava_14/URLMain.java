package com.epam.glava_14;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLMain {
    public static void main(String[] args) {
        String urlName = "http://google.com";
        int tiemOut = 10_000_000;
        try {
            URL url = new URL(urlName);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(tiemOut);
            urlConnection.connect();
            System.out.println(urlName + " :: content type: " + urlConnection.getContentType());
          //  System.out.println( urlConnection.getConnectTimeout());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
