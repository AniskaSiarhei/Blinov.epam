package com.epam.glava_11.iterators;

import com.epam.glava_11.arayList.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorMain {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.));
                add(new Order(389, 29.));
                add(new Order(747, 32.));
                add(new Order(517, 18.));
                add(new Order(414, 17.));
                add(new Order(777, 10.));
            }
        };
//        Iterator<Order> iterator = orders.iterator();
//        while (iterator.hasNext()) {
//            Order order = iterator.next();
//            System.out.println(order);
//        }

        //  orders.forEach(System.out::println);

        final int controlAmount = 20;
        final int discount = 10;

//        Iterator<Order> iterator = orders.iterator();
//        while (iterator.hasNext()) {
//            Order current = iterator.next();
//            if (current.getAmount() < controlAmount) {
//                iterator.remove();
//                continue;
//            }
//            current.setAmount(current.getAmount() * (100-discount) / 100.0);
//        }
//        orders.forEach(System.out::println);

//        orders.removeIf(o -> o.getAmount() <= controlAmount);
//        orders.forEach(o -> o.setAmount(o.getAmount() * (100 - discount) / 100.0));
//        orders.forEach(System.out::println);
//
//        List<Order> orders1 = new ArrayList<>();
//        // list fillig
//
//        orders1.add(new Order(12, 12.1)); // or orders.remove(0);
//        Iterator<Order> iterator = orders1.iterator();
//        while (iterator.hasNext()) { // generation exception
//            System.out.println(iterator.next());
//        }

        List<Order> orderList = orders.stream()
                .filter(o -> o.getAmount() <= controlAmount)
                .map(o -> { o.setAmount(o.getAmount() * (100-discount)/100);
                return o;})
                .collect(Collectors.toList());

        System.out.println(orderList);
    }
}
