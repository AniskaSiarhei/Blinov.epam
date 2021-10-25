package com.epam.glava_10.serializabl;

import java.io.Serializable;
import java.util.StringJoiner;

public class Student implements Serializable {
    static String faculty = "MMF";
    private String name;
    public int id;
    private transient String password;
    private static final long serialVersionUID = 2L;
    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name = '" + name + "'").add("id = " + id).add("faculty = " + faculty)
                .add("password = '" + password + "'").toString();
    }
}
