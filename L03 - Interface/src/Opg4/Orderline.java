package Opg4;

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

    public int orderLinePrice() {
      int total = 0;
       return total += product.getUnitPrice();
    }

    public double getOrderLinePrice() {
        return product.getUnitPrice() * count;
    }

}


