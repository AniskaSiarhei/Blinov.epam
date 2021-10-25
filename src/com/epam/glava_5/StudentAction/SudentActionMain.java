package com.epam.glava_5.StudentAction;

public class SudentActionMain {
    public static void main(String[] args) {
        StudentAction action = new StudentAction();
        StudentAction actionAnon = new StudentAction(){
            int base = 9;

            @Override
            public double defineScholarship(float averageMark) {
                double value = 100;
                if (averageMark > base) {
                    value *= 1 + (base / 10.0);
                }

                return value;
            }
        };
        System.out.println(action.defineScholarship(9.05f));
        System.out.println(actionAnon.defineScholarship(9.05f));
    }
}
