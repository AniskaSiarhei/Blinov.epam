package com.epam.glava_11.hashTables;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Jeans", 40);
        hashtable.put("T-Shirt", 35);
        hashtable.put("Gloves", 42);
        hashtable.compute("Shoes", (k, v) -> 77);
        System.out.println(hashtable);
        Enumeration<String> keys = hashtable.keys();
        while ((keys.hasMoreElements())) {
            System.out.println(keys.nextElement());
        }
        Enumeration<Integer> values = hashtable.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

    }
}
