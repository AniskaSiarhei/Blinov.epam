package com.epam.glava_4.abstractMethod;

public abstract class AbstractQuest {
    private long questId;
    private String content;

    public abstract boolean check(Answer answer);
}
