package Opg3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Product p1 = new Product(5,"Computer",2000);
    Product p2 = new Product(221,"Ipad",1500);
    Product p3 = new Product(551,"Mikrofon",800);
    Product p4 = new Product(224,"Seng",11000);
    Product p5 = new Product(1001,"Sofa",5500);
    Customer c1 = new Customer("Jan Eriksen", LocalDate.of(28,11,2));
    Customer c2 = new Customer("Tove Ditlevsen",LocalDate.of(31,2,13));
    Order o1 = new Order(3);
    Order o2 = new Order(10);
    Orderline ol = new Orderline(22,40,p1);
    Orderline ol2 = new Orderline(44,10,p4);
    o1.addOrderline(ol);
    o1.addOrderline(ol2);
    o2.addOrderline(ol);
    o2.addOrderline(ol2);
    c1.addOrder(o1);
    c2.addOrder(o2);




    }
}
