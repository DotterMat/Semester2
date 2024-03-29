package Polymorphism;

public class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }
    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }

}
