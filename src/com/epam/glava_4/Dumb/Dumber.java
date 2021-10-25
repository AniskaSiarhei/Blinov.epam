package com.epam.glava_4.Dumb;

class Dumb{
    {
        this.id = 6;
    }
    int id;

    public Dumb() {
        System.out.println("constructor Dumb ");
        id = getId();
        System.out.println(" id = " + id);
    }
    int getId() {
        System.out.println("getId() from Dumb ");
        return id;
    }
}

public class Dumber extends Dumb{
    int id = 9;

    public Dumber() {
        System.out.println("constructor Dumber");
        id = this.getId();
        System.out.println(" id = " + id);
    }

    @Override
    int getId() {
        System.out.println("getId() of Dumber");
        return id;
    }

    public static void main(String[] args) {
        Dumb dumb = new Dumber();
    }
}
