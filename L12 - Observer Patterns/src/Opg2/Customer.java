package Opg2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {
    //Mange til mange forhold
    private Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        books.add(book);
        book.addCustomer(this);
    }
    public void removeBook(Book book) {
        books.remove(book);
        book.removeCustomer(this);
    }

    public Set<Book> getBooks() {
        return books;
    }
}
