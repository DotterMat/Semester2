package more2Polymorphism;

public class Gris extends Dyr{
    private String navn;

    public Gris(String navn) {
        this.navn = navn;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Øf" + " ja jeg er en: " + getClass().getSimpleName() + " og jeg hedder " + navn);
    }
}
