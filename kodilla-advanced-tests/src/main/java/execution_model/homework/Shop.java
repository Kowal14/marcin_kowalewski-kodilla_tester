package execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public int getSize() {
        return this.orders.size();
    }
    List<Order> getOrders(int minValue, int maxValue) {
        return this.orders.stream()
                .filter(order -> order.getValue() > minValue && order.getValue() < maxValue)
                .collect(Collectors.toList());
    }
    List<Order> getOrders(LocalDate minDate, LocalDate maxDate) {
        return this.orders.stream()
                .filter(order -> order.getDate().isAfter(minDate) && order.getDate().isBefore(maxDate))
                .collect(Collectors.toList());
    }
    public double getSum() {
        return this.orders.stream()
                .mapToInt(order -> order.getValue())
                .sum();
    }

    }


