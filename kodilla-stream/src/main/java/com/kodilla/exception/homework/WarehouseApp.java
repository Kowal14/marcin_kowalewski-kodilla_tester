package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Order order = new Order("one");
        Order order1 = new Order("two");
        Order order2 = new Order("three");
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order);
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        try{
        warehouse.getOrder("four");

        }catch (OrderDoesntExistsException exception) {
            System.err.println("nie ma takiego zamówienia");
        }

    }
}
