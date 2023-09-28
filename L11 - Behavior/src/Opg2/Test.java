package Opg2;


import Opg2.comparator.NameComparator;
import Opg2.comparator.NumberComparator;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
      Customer c1 = new Customer(33, "Alice");
      Customer c2 = new Customer(22, "Bob");
      Customer c3 = new Customer(44,"Charlie");

        Comparator<Customer> numberComparator = new NumberComparator();
        System.out.println("Sammenligt tallene");
        System.out.println(numberComparator.compare(c1,c2));
        System.out.println(numberComparator.compare(c2,c3));
        System.out.println(numberComparator.compare(c3,c1));

        System.out.println("Sammenlign navnene");
        Comparator<Customer> NameComparator = new NameComparator();
        System.out.println(NameComparator.compare(c1,c2));
        System.out.println(NameComparator.compare(c2,c3));
        System.out.println(NameComparator.compare(c3,c1));
    }
}
