package com.epam.glava_5.Study;

import com.epam.glava_4.studets.Student;

public class Teacher extends AbstractTeacher{
    public Teacher(int id) {
        super(id);
    }

    @Override
    public boolean remandStudent(Student student) {
        return false;
    }
}
