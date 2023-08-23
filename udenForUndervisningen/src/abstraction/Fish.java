package abstraction;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    //når du overwriter fra en abstract klasse, kan du initialisere dine metoder, og kode dem i subklassen
    public void move(String speed) {
    if(speed == "slow") {
        System.out.println(getExplicitType() + "lazily swimming");
    } else {
        System.out.println(getExplicitType() + "darting frantically");
    }
    }
    @Override
    public void makeNoise() {
    if (type == "Goldfish") {
        System.out.print("Swish ");
    } else {
        System.out.print("Splash ");
    }
    }
}
