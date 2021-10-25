package com.epam.glava_9.throwss;

import com.epam.glava_9.myExceptions.ResourceException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ActionMain {
    public static void main(String[] args) {
        Resourse resourse = null;
        try {
            ResourseAction.load(resourse);
        } catch (ResourceException e) {
            System.out.println(e.getCause());
        }
        ActionMain actionMain = new ActionMain();
        actionMain.loadFile("config.txt");
    }

    public void loadFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("fatal error: config file not found: " + fileName, e);
        }

    }
}
class ResourseAction {
    public static void load(Resourse resourse) throws ResourceException {
        if (resourse == null || !resourse.exists() || !resourse.isCreate()) {
            throw new ResourceException();
        }
    }
}

class Resourse {
    //field
    public boolean isCreate() {
        // more code
        return true;
    }
    public boolean exists() {
        return false;
    }
    public boolean execute() {
        return false;
    }
    public boolean close() {
        return true;
    }
}














