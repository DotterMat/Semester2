package Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie() {
        // this.getClass().getSimpleName() er navnet på objeket, i dette tilfælde "Movie"
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");

    }
}
