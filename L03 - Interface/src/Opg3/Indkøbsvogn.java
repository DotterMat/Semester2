package Opg3;

import java.util.ArrayList;

public class Indkøbsvogn {

    public ArrayList<Vare> vares = new ArrayList<>();

    public double samletPris() {
        double total = 0;
        for (Vare v : vares) {
            total += v.getPris();
        }
        return total;
    }
    public double samletPrisMoms() {
        double total = 0;
        for (Vare v : vares) {
            total += v.getMoms();
        }
        return total;
    }

    public void printIndkøbsvogn() {
        String pris = "pris";
        String streg = "-".repeat(35);
        String streg1 = "-".repeat(35);
        String moms = "moms:".toUpperCase();
        System.out.println("Kvittering".toUpperCase() + String.format("%24s", pris.toUpperCase()));
        System.out.println(streg);
        for (Vare vare : vares) {
            System.out.printf("%-15s%20s%n", vare.getNavn(), String.format("%.2f kr.", vare.getPris()));
        }
        String streg2 = "-".repeat(35);
        System.out.println(streg2);
        String streg4 = "-".repeat(35);
        System.out.println(String.format("%s%26.2f kr.", moms, samletPrisMoms()) + "\n" + streg4);
        String streg3 = "-".repeat(35);
        String total = "total".toUpperCase();
        System.out.println(String.format("%34s", total));
        System.out.printf("%31.2f kr.", samletPris());
        System.out.println("\n" + streg3);
    }

    public void tilføjVare(Vare vare) {
        vares.add(vare);
    }

}





