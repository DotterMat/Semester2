package Opg4.PaymentBehavior;

import java.util.ArrayList;
import java.util.List;

public class PaypalPayment implements Payment{
    private String mail;
    private String password;

    public PaypalPayment(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid using Paypal " + amount);
    }
}
