package Opg3;

public class PercentDiscount extends Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getDiscount(double price) {
        return (price * discountPercentage) / 100;
    }
}
