package Opg3;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Vare Fette_Blanc = new Spiritus("Fetta Blanc", 32, "drikDet", 37, 400);
        Vare Vodka = new Spiritus("Vodka", 12, "Smirenoff", 40, 120);
        Vare Mandarin = new Fødevare("Mandarin", 32, "Klementin", LocalDate.of(2023, 8, 1), 13);
        Vare Banan = new Fødevare("Banan", 41, "banan_Træ", LocalDate.of(2023, 12, 1), 2.5);
        Vare El_Kedel = new Elartikel("El-Kedel", 241, "Brænd dig ikke", 400, 20);
        Vare Vaskemaskine = new Elartikel("Vaskemaskine", 273, "Husk at vaske", 7000, 221);
        Vare Sæbe = new Vare("Sæbe", 42, "huskAtBrugeSæbe", 2000);
        Vare Müslibar = new Vare("Müslibar", 22, "", 1000);

        Indkøbsvogn indkøbsvogn = new Indkøbsvogn();
        indkøbsvogn.tilføjVare(Fette_Blanc);
        indkøbsvogn.tilføjVare(Mandarin);
        indkøbsvogn.tilføjVare(Banan);
        indkøbsvogn.tilføjVare(El_Kedel);
        indkøbsvogn.tilføjVare(Sæbe);
        indkøbsvogn.tilføjVare(Müslibar);

        indkøbsvogn.printIndkøbsvogn();

    }
}