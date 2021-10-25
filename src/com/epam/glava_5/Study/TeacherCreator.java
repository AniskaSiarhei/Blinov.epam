package com.epam.glava_5.Study;

import com.epam.glava_4.studets.Student;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {
        int value = 0;

        class Rector extends AbstractTeacher {

            public Rector(int id) {
                super(id);
            }

            @Override
            public boolean remandStudent(Student student) {
                boolean result = false;
                if (student != null) {
                    return true;
                }
                return result;
            }
        }
        if (isRector(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    private static boolean isRector(int id) {
        return (id == 6);
    }


}














