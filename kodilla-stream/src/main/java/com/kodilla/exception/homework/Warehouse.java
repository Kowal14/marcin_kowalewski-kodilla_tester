package com.kodilla.exception.homework;

import java.util.ArrayList;

import java.util.List;


public class Warehouse {
    public static void main(String[] args) {
        getOrder();
    }
    public static List<Order> getOrdersList() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("321"));
        orders.add(new Order("111"));
        orders.add(new Order("100"));
        return orders;
    }

    public static void getOrder() {
        Warehouse.getOrdersList()
                .stream()
                .map(order -> order.getOrderNumber())
                .forEach(number -> System.out.println(number));
    }
}