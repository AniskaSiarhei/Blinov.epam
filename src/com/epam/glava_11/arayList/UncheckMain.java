package com.epam.glava_11.arayList;

import java.util.ArrayList;
import java.util.List;

public class UncheckMain {
    public static void main(String[] args) {
        List raw = List.of(new Order(231, 12.f),
                new ArrayList<>(),
                new Order(217, 17.f),
                "Unitas");

        Order order1 = (Order) raw.get(0);
        ArrayList order2 = (ArrayList) raw.get(1);
        Order order3 = (Order) raw.get(2);
        String order4 = (String) raw.get(3);

        raw.forEach(System.out::println);

        List<Order> orders = List.of(new Order(231, 12.f),
                new Order(389, 29f),
                //new ArrayList(),
                new Order(217, 17.f));

        orders.forEach(System.out::println);

    }
}
