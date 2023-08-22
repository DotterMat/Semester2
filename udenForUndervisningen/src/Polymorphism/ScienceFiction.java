package Polymorphism;

public class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do bad stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
    public void watchScienceFiction() {
        System.out.println("Watching a Scince Ficture Thriller!");
    }
}
