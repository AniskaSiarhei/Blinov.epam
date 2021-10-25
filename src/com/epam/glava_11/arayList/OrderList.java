package com.epam.glava_11.arayList;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private List<Order> orderList;

    public OrderList() {
        this.orderList = new ArrayList<Order>();
    }
    public OrderList(List<Order> orders) {
        this.orderList = orders;
    }

    public List<Order> getOrders() {
        return List.copyOf(orderList);
    }
}
