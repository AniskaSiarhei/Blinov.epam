package com.epam.glava_4.abstractMethod;

public class TestAction {
    public int checkTest(AbstractQuest[] test) {
        int counter = 0;
        for (AbstractQuest s: test) {
            counter = s.check(new Answer()) ? ++counter : counter;
        }
        return counter;
    }
}
