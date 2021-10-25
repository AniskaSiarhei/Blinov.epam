package com.epam.glava_11.sets;

import java.util.Set;
import java.util.TreeSet;

public class HashSetMain2 {
    public static void main(String[] args) {
        Set<String> stringSet = Set.of("2Y", "8Y", "6Y", "5Y", "Y-");
        System.out.println(stringSet);
        TreeSet<String> treeSet = new TreeSet<>(stringSet);
        treeSet.add("Y-");
        System.out.println(treeSet);
        System.out.println(treeSet.last() + "  " + treeSet.first());
    }
}
