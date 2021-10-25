package com.epam.glava_10.serializabl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationMain {
    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data/resObj.txt"))) {
            Student student = new Student("Janka", 5557777, "VKL_1410");
            System.out.println(student);
            objectOutputStream.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
