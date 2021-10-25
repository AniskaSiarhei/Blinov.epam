package com.epam.glava_5.Study;

import com.epam.glava_4.studets.Student;

public class StudyMain {
    public static void main(String[] args) {
        TeacherLogic logic = new TeacherLogic();
        Student student = new Student();
        logic.expelledProgress(42, student);
        logic.expelledProgress(6, student);
    }
}
