package Opg4;

import java.util.ArrayList;

public class PercentDiscount implements Discount {
    private int discountPercentage;
    private String description;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getDiscount(double price) {
        return (price * discountPercentage) / 100;
    }

    @Override
    public double discountedPrice(double price) {
        return price;
    }
}
