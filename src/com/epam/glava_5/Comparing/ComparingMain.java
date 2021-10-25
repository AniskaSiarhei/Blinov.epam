package com.epam.glava_5.Comparing;

public class ComparingMain {
    public static void main(String[] args) {
        Student student1 = new Student(2341757, "Mazaliyk", 3, 5.42f);
        Student student2 = new Student(2341742, "Polovinkin", 1, 5.42f);

        Student.NameComparator nameComparator = new Student.NameComparator();
        int result1 = nameComparator.compare(student1, student2);
        System.out.println(student1.getName() + " [" + result1 + "] " + student2.getName());

        Student.MarkComparator markComparator= new Student.MarkComparator();
        int result2 = markComparator.compare(student1, student2);
        System.out.println(student1.getAverageMark() + " [" + result2 + "] " + student2.getAverageMark());

        Student.GroupComparator groupComparator = new Student.GroupComparator();
        int result3 = groupComparator.compare(student1, student2);
        System.out.println(student1.getGroup() +  " [" + result3 + "] " + student2.getGroup());

    }
}
