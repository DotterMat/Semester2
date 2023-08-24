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
    public void addOrderline(Product product, int count) {

    }
}
