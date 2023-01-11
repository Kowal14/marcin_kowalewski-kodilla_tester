package execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private int number;
    private int value;
    private LocalDate date;
    private String login;

    public Order(int number, int value, LocalDate date, String login) {
        this.number = number;
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public int getNumber() {

        return number;
    }

    public int getValue() {

        return value;
    }
    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", value=" + value +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number == order.number && value == order.value && order.date.equals(date)  && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, value, date, login);
    }

    public String getLogin() {
        return login;
    }
}
