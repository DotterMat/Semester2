package Opg4;

import Opg4.ShoppingCart;

public class Item {
    private String name;
    private int price;


    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
