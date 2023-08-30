package Opg4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
    private String name;
    private LocalDate birthDay;
    private Discount discount;

    private ArrayList<Order> orders = new ArrayList<>();

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
        for (Order o : orders) {
            total += o.getOrderPrice();
        }
        return total;
    }

    public double totalBuyWithDiscount() {
        double discounts = 0;
        if (discount != null) {
            for (Order o : orders) {
                discounts = totalBuy() - discount.getDiscount(o.orderPrice());
            }
            return discounts;

        }
        return this.totalBuy();
    }

    public void printTotalPriceWithAndWithoutDiscount() {
        if (discount == null) {
            for (Order o : orders) {
                System.out.println(o);
            }
        } else {
            for (Order o : orders) {
                System.out.println("Den totale pris for en varer uden tilbud er: " + o.orderPrice() + " kr.");
                if (discount.getDiscount(o.orderPrice()) != 0) {
                    System.out.println("Den totale pris for en ordre med tilbud er: " + (o.orderPrice() - discount.getDiscount(o.orderPrice()) + " kr."));
                }
            }
        }
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double discountedPrice(double price) {
        return discount.getDiscount(price);
    }
}

