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
    public void printIndkøbsvogn() {
        String pris = "pris";
        String streg = "-".repeat(35);
        String streg3 = "-".repeat(35);
        System.out.println(streg);
        System.out.println("Kvittering".toUpperCase() + String.format("%24s", pris.toUpperCase()));
        for(Vare v : vares) {
            System.out.println(v.toString());
            System.out.println(String.format("%31.2f", v.samletPris()) + " kr.");
            String total = "total".toUpperCase();
            System.out.println(String.format("%34s", total));
            String streg4 = "-".repeat(35);
            System.out.println(streg4);
        }
    }
}



