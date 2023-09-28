package Opg4;

import Opg4.PaymentBehavior.CreditCardPayment;
import Opg4.PaymentBehavior.PaypalPayment;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Sucker",10));
        cart.addItem(new Item("Beers",40));
        cart.pay(new CreditCardPayment("John Doe","1234567890123456"));
        cart.pay(new PaypalPayment("johndoe@example.com","MyPassword"));
    }
}
