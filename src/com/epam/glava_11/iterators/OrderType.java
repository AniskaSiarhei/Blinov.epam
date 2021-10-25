package com.epam.glava_11.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class OrderType implements Iterable<String>{
    private int orderId;
    private List<String> currencyNames = new ArrayList<>();

    public OrderType(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getCurrencyNames() {
        return List.copyOf(currencyNames);
    }

    public boolean add(String e) {
        return currencyNames.add(e);
    }

    @Override
    public Iterator<String> iterator() {
        return currencyNames.iterator();
    }
}
