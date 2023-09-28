package Opg4.PaymentBehavior;

import Opg4.ShoppingCart;

public class CreditCardPayment implements Payment{
    private String name;
    private String cartNumber;


    public CreditCardPayment(String name, String cartNumber) {
        this.name = name;
        this.cartNumber = cartNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid with credit card: " + amount);
    }
}
