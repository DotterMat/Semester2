package Opg2;


import Opg2.comparator.CustomerCumparator;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private int number;
    private String name;
    private static CustomerCumparator comparator;

    public Customer(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Customer o) {
      return this.name.compareTo(o.getName());
    }
}
