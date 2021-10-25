package com.epam.glava_4.studets;

public class Student {
    private int id;
    private String name;
    private int yearOfStudy;

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

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        if (id != student.id) {
            return false;
        }
        if (yearOfStudy != ((Student) obj).yearOfStudy) {
            return false;
        }
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        return id + 31 * yearOfStudy + (name != null ? name.hashCode() : 0);
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Student { ");
        stringBuilder.append("id = ").append(id);
        stringBuilder.append(", name = ").append(name).append('\'');
        stringBuilder.append(", yearOfStudy = ").append(yearOfStudy);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
