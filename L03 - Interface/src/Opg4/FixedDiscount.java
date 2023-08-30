package Opg4;

import java.util.ArrayList;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;
    private String description;

    public FixedDiscount(int fixedDiscount, int discountLimit,String description) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
        this.description = description;
    }

    @Override
    public double getDiscount(double price) {
        if (price > discountLimit) {
            return fixedDiscount;
        } else return 0;
    }

    @Override
    public double discountedPrice(double price) {
        return price;
    }
}


