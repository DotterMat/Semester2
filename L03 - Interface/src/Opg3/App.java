package Opg3;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Vare Fette_Blanc = new Spiritus("Fetta Blanc", 32, "drikDet", 37, 400,5);
        Vare Vodka = new Spiritus("Vodka", 12, "Smirenoff", 40, 120,4);
        Vare Mandarin = new Fødevare("Mandarin", 32, "Klementin", LocalDate.of(2023, 8, 1), 211,3);
        Vare Banan = new Fødevare("Banan", 41, "banan_Træ", LocalDate.of(2023, 12, 1), 2.5,221);
        Vare El_Kedel = new Elartikel("El-Kedel", 241, "Brænd dig ikke", 400, 20,2);
        Vare Vaskemaskine = new Elartikel("Vaskemaskine", 273, "Husk at vaske", 7000, 221,6000);
        Vare Sæbe = new Vare("Sæbe", 42, "huskAtBrugeSæbe", 2000,2);
        Vare Müslibar = new Vare("Müslibar", 22, "", 1000,21);
        Vare Drikkedunk = new Vare("Drikkedunk",12,"Salt",240,5);
        Indkøbsvogn indkøbsvogn = new Indkøbsvogn();
        indkøbsvogn.tilføjVare(Fette_Blanc);
        indkøbsvogn.tilføjVare(Mandarin);
        indkøbsvogn.tilføjVare(Banan);
        indkøbsvogn.tilføjVare(El_Kedel);
        indkøbsvogn.tilføjVare(Sæbe);
        indkøbsvogn.tilføjVare(Müslibar);
        indkøbsvogn.tilføjVare(Drikkedunk);
        indkøbsvogn.tilføjVare(Vaskemaskine);
        indkøbsvogn.printBon();

    }
}