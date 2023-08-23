package abstraction2;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getPrice(double antal) {
        return antal * price;
    }
    public void printPricedItem(int antal) {
        System.out.printf("%2d qty at $%8.2f each,%-15s %-35s %n", antal,price,type,description);
    }
    public abstract void showDetails();

    }

