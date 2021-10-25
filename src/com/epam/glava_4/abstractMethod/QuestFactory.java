package com.epam.glava_4.abstractMethod;

public class QuestFactory {
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch (mode) {
            case 0:
                return new DragnDropQuest();
            case 1:
                return new SingleChoiseQuest();
            default:
                throw new IllegalArgumentException("illegal mode");

        }
    }
}
