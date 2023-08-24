package Opg3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
    private String name;
    private LocalDate birthDay;
    private Discount discount;

    private ArrayList<Order> orders= new ArrayList<>();
    public Customer(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }
    public double totalBuy() {
    double total = 0;
    for(Order o : orders) {
        total += o.orderPrice();
    }
    return total;
    }
    public double totalBuyWithDiscount(double price) {
        return totalBuy() + discount.getDiscount(price);
    }
}
