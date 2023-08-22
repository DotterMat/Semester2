package more2Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dyr hund = new Hund("Findus");
        Dyr kat = new Kat("Pedersen");
        Dyr gris = new Gris("Sigurd");

        ArrayList<Dyr> dyrs = new ArrayList<>();
        dyrs.add(hund);
        dyrs.add(kat);
        dyrs.add(gris);
        for (Dyr d : dyrs) {
            d.makeSound();
        }
    }
}
