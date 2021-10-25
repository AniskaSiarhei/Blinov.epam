package com.epam.glava_3;

public class TaskMain {
    public static void main(String[] args) {
        Task<Double> task1 = new Task<>(71.41D, "JSE");
        Task<Double> task2 = new Task<>(71.45D, "JEE");
        System.out.println(task1.equalsToMark(task2));
        Task<Integer> task = new Task<>(71, "Scala");
        System.out.println(task1.equalsToMark(task));
    }
}

class Task <T extends Number> {
    private T mark;
    private String name;

    public Task(T mark, String name) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }
    public boolean equalsToMark(Task<?> task) {
        return roundMark() == task.roundMark();
    }
    private int roundMark() {
        return Math.round(mark.floatValue());
    }

}













