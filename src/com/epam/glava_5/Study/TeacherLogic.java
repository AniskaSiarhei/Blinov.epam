package com.epam.glava_5.Study;

import com.epam.glava_4.studets.Student;

public class TeacherLogic {
    public void expelledProgress(int recordId, Student student) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(recordId);
        boolean result = teacher.remandStudent(student);
        System.out.println("Student expelled: " + result);
    }


}
