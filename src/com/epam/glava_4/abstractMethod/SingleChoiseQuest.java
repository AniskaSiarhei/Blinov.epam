package com.epam.glava_4.abstractMethod;

import java.util.Random;

public class SingleChoiseQuest extends AbstractQuest{
    @Override
    public boolean check(Answer answer) {
        return new Random().nextBoolean();
    }
}
