package com.kodilla.exception.homework;

import java.util.ArrayList;

import java.util.List;


public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getOrder(String order) throws OrderDoesntExistsException {
        String orderNumber = orders.stream()
                .filter(order1 -> order1.getOrderNumber().equals(order))
                .map(order1 -> order1.getOrderNumber())
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistsException());
        return orderNumber;
    }



    }

