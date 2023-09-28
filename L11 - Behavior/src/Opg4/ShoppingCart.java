package Opg4;

import Opg4.PaymentBehavior.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }


    public void pay(Payment payment) {
        int totalSum = 0;
        for (Item i : items) {
            totalSum += i.getPrice();
        }
        payment.pay(totalSum);
    }
}


