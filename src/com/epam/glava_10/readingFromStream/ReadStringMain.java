package com.epam.glava_10.readingFromStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadStringMain {
    public static void main(String[] args) {
        String stringLines = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("data/res.txt"))){
            String tmp;
            while ((tmp = reader.readLine()) != null) {
                stringLines += tmp;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringLines);
    }
}
