package com.epam.glava_11.linked;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() {
            {
                this.offer("Jeans");
            }
        };
        queue.add("Dress");
        queue.offer("Gloves");
        queue.offer("T-Shirt");
        queue.stream()
                .filter(s-> !s.endsWith("s"))
                .forEach(System.out::println);

        System.out.println("----------------");
      //  queue.removeIf(s->s.endsWith("s"));

        queue.forEach(System.out::println);

    }
}
