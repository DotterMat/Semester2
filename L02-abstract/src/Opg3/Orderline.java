package Opg3;

public class Orderline {
    private int lineNumber;
    private int count;
    private Product product;
    public Orderline(int lineNumber, int count, Product product) {
        this.lineNumber = lineNumber;
        this.count = count;
        this.product = product;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }
}


