package com.epam.glava_11.arayList;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5, 87);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
