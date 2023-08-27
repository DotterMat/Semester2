package Opg3;

import java.util.ArrayList;

public class Order {
    private int number;
    private ArrayList<Orderline> orderlines = new ArrayList<>();

    public Order(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void addOrderline(Orderline orderline) {
        orderlines.add(orderline);

    }

    public ArrayList<Orderline> getOrderlines() {
        return new ArrayList<>(orderlines);
    }
    public double orderPrice() {
        double total = 0;
        for (Orderline ol : orderlines) {
            return total += ol.orderLinePrice();
        }
        return total;
    }
    public double getOrderPrice() {
        return orderPrice();
    }

    @Override
    public String toString() {
        return "Den totale pris på varen er: " + orderPrice() + " kr.";
    }
}


