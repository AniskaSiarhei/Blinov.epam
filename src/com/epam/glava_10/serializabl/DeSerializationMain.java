package com.epam.glava_10.serializabl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationMain {
    public static void main(String[] args) {
        Student.faculty = "GEO";
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data/resObj.txt"))){
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
