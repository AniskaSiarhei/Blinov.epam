package com.epam.glava_4.abstractMethod;

import java.util.Random;

public class DragnDropQuest extends AbstractQuest{
    @Override
    public boolean check(Answer answer) {
        return new Random().nextBoolean();
    }
}
