package more2Polymorphism;

public class Hund extends Dyr {
    private String navn;

    public Hund(String navn) {
        this.navn = navn;
    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Vov" + ", ja jeg er en: " + getClass().getSimpleName() + " og jeg hedder: " + navn);
    }
}
