package com.epam.glava_4.abstractMethod;

public class QuizMain {
    public static void main(String[] args) {
        TestGenerator generator = new TestGenerator();
        AbstractQuest[] test = generator.generateTest(60, 2);
        TestAction action = new TestAction();
        int result = action.checkTest(test);
        System.out.println(result + " correct answers, " + (60 - result) + " incorrect");
    }
}
