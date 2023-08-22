package more2Polymorphism;

public class Kat extends Dyr{
    private String navn;

    public Kat(String navn) {
        this.navn = navn;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Miaw" + ", ja jeg er en " + getClass().getSimpleName() + " og jeg hedder: " + navn);
    }
}
