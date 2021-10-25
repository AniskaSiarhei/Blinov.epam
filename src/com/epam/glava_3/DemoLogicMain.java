package com.epam.glava_3;

public class DemoLogicMain {
    static {
        System.out.println("MAIN!");
    }
    public static void main(String[] args) {
        new Department(71);
        new Department(17);
    }
}

class Department {
    {
        System.out.println("logic (1) id = " + this.id);
    }

    static {
        System.out.println("static logic block");
    }

    private int id = 42;

    public Department(int id) {
        this.id = id;
        System.out.println("constructor id  = " + id);
    }

    public int getId() {
        return id;
    }

    {
        System.out.println("logic (2) id = " + id);
    }
}


















