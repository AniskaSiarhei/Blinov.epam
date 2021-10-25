package com.epam.glava_11.linked;

import com.epam.glava_11.arayList.Order;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityMain {
    public static void main(String[] args) {
        Queue<String> priorQueue = new PriorityQueue<>();
        priorQueue.offer("J");
        priorQueue.offer("A");
        priorQueue.offer("V");
        priorQueue.offer("A");
        priorQueue.offer("C");
        priorQueue.offer("1");
        priorQueue.offer("0");
        priorQueue.offer("4");
        while (!priorQueue.isEmpty()) {
            System.out.println(priorQueue.poll());
        }

//        PriorityQueue<Order> orders = new PriorityQueue<>();
//        orders.add(new Order(546, 53.));
//        orders.add(new Order(146, 17.));

        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add(new String("Orcle"));
        stringPriorityQueue.add(new String("Google"));
        System.out.println(stringPriorityQueue);
    }
}
