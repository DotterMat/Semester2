package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy =  Movie.getMovie("C","Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        var Plane = new Comedy("Airplane");
        Plane.watchComedy();

        Object unknownObject = Movie.getMovie("C","Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
            //tester om objektet er et adventure object, og hvis det er sandt, caster vi et unknown objekt til Adventure.
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
