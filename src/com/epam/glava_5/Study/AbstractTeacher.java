package com.epam.glava_5.Study;

import com.epam.glava_4.studets.Student;

public abstract class AbstractTeacher {
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }
    public abstract boolean remandStudent (Student student);
}
