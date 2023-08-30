package Opg3;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Vare v1 = new Spiritus("Fetta Blanc", 32, "drikDet", 37, 400);
        Vare v2 = new Spiritus("Vodka", 12, "Smirenoff", 40, 120);
        Vare v3 = new Fødevare("Mandarin", 32, "Klementin", LocalDate.of(2023, 8, 1), 13);
        Vare v4 = new Fødevare("Banan", 41, "banan_Træ", LocalDate.of(2023, 12, 1), 2.5);
        Vare v5 = new Elartikel("El-Kedel", 241, "Brænd dig ikke", 400, 20);
        Vare v6 = new Elartikel("Vaskemaskine", 273, "Husk at vaske", 7000, 221);
        Vare v7 = new Vare("Sæbe", 42, "huskAtBrugeSæbe", 2000);
        Vare v8 = new Vare("Müslibar", 22, "", 1000);





        ArrayList<Vare> vareMedMoms = new ArrayList<>();
        vareMedMoms.add((Spiritus) v1);
        vareMedMoms.add((Fødevare) v3);
        vareMedMoms.add((Elartikel) v5);
        String streg2 = "-".repeat(35);
        String moms = "moms:".toUpperCase();
        boolean samletPrisUdskrevetMoms = false;
        String pris = "pris";
        System.out.println("Kvittering".toUpperCase() + String.format("%24s", pris.toUpperCase()));
        String streg = "-".repeat(35);
        String streg3 = "-".repeat(35);
        System.out.println(streg);
        for (Vare v : vareMedMoms) {
                v.printIndkøbsvogn();
                System.out.println(streg2);
                System.out.println(String.format("%s%26.2f", moms, v.samletPrisMoms(vareMedMoms)) + " kr.");
                System.out.println(streg3);

            }
        String total = "total".toUpperCase();
        System.out.println(String.format("%34s", total));

        String streg4 = "-".repeat(35);
        System.out.println(streg4);

    }
}