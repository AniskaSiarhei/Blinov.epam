package com.epam.glava_3.dz;

//Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
//Факультет, Курс, Группа.

import java.util.*;

public class Student {
    private String lastName;
    private Date data;
    private String facultet;
    private int kurs;
    private String gruppa;

    public Student(String lastName, Date data, String facultet, int kurs, String gruppa) {
        this.lastName = lastName;
        this.data = data;
        this.facultet = facultet;
        this.kurs = kurs;
        this.gruppa = gruppa;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getData() {
        return data;
    }

    public String getFacultet() {
        return facultet;
    }

    public int getKurs() {
        return kurs;
    }

    public String getGruppa() {
        return gruppa;
    }

    public static void getSpisokPoKursu(List<Student> students, int kurs) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getKurs() == kurs) {
                System.out.println(students.get(i).lastName);
            }
        }
    }

    public static void getSpisokPosleGoda(List<Student> students, int data) {
        for (int i = 0; i < students.size(); i++) {
            Calendar calendar = Calendar.getInstance();
         //  calendar.setTime(students.get(i).getData());
            calendar.setTime(students.get(i).getData());
            System.out.println(calendar.get(Calendar.YEAR));
        }
    }

    public static void main(String[] args) {
        List <Student> studentList = new ArrayList<>();
 //       studentList.add(new Student("Ivanov", new GregorianCalendar(2017, 0 , 25), "matematic", 5, "5A"));
        studentList.add(new Student("Petrov", new Date(1986), "fizik", 2, "2A"));
//        studentList.add(new Student("Sidorov", new Date(9-01-1987), "matematic", 4, "4A"));
//        studentList.add(new Student("Smirnov", new Date(13-10-1988), "fizik", 5, "5A"));
//        studentList.add(new Student("Kozlov", new Date(01-03-1984), "matematic", 3, "3A"));

        getSpisokPoKursu(studentList, 4);
        getSpisokPosleGoda(studentList, 1986);

    }
}
