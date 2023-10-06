package Opg2;

import Opg1.ObserverBag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {
    //Mange til mange forhold
    private Set<Customer> customers = new HashSet<>();
    private Set<BookObserver> bookObservers = new HashSet<>();
    private int numberOfCopies;


    public void addCustomer(Customer customer) {
        customers.add(customer);
        customer.addBook(this);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        customer.removeBook(this);
    }

    public void addObserver(BookObserver bookObserver) {
        bookObservers.add(bookObserver);
    }

    public void removeObserver(BookObserver bookObserver) {
        bookObservers.remove(bookObserver);
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void decrementCopies() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            notifyObserver();
        }

    }

    public void notifyObserver() {
        for (BookObserver bookObserver : bookObservers) {
            bookObserver.update(this);
        }
    }

    public void purchaseCopies(int numberOfCopies) {
        this.numberOfCopies += numberOfCopies;
    }

}


