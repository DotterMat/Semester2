package opg4;

import Opg4.Customer;
import Opg4.Discount;

import java.time.LocalDate;
import java.time.Period;

public class AgeDiscount implements Discount {
    private int age;

    public AgeDiscount(Customer customer) {
        LocalDate now = LocalDate.now();
        this.age = Period.between(customer.getBirthDay(), now).getYears();
    }

    @Override
    public double getDiscount(double price) {
        return price;
    }

    @Override
    public double discountedPrice(double price){
        return price * age / 100;
    }
}