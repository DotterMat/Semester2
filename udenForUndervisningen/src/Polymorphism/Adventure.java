package Polymorphism;


import java.sql.SQLOutput;

public class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Interstellare",
                "Indiana Jones",
                "Riders of justice");
    }
    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}
