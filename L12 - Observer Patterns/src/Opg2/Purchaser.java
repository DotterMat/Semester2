package Opg2;

public class Purchaser implements BookObserver{
    private String name;
    public Purchaser(String name) {
        this.name = name;
    }
    @Override
    public void update(Book book) {
        System.out.println("Notification to purchaser, the book has been sold");
        if (book.getNumberOfCopies() < 6) {
            book.purchaseCopies(10);
            System.out.println("Purchaser has purchased 10 more to fill the stuck");
        }
    }
}
