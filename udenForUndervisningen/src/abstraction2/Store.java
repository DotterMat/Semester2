package abstraction2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Store {
    record OrderItem(int antal, ProductForSale product) {

    }
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.antal());
            salesTotal += item.product().getPrice(item.antal());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
