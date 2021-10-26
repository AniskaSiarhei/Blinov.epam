package com.epam.glava_13.createrequest;

public class Abonent extends Entity{
    private int id;
    private String name;
    private int phone;

    public Abonent() {
    }

    public Abonent(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Abonent{");
        stringBuilder.append("id = ").append(id).append(", name = ").append(name).append('\'');
        stringBuilder.append(", phone = ").append(phone).append('}');
        return stringBuilder.toString();
    }
}
