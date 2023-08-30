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

    public void printBon() {
        String pris = "pris";
        String streg = "-".repeat(51);
        String streg1 = "-".repeat(51);
        String moms = "moms:".toUpperCase();
        System.out.println("Kvittering".toUpperCase() + String.format("%40s", pris.toUpperCase()));
        System.out.println(streg);
        for (Vare vare : vares) {
            if (vare.getAntal() > 1) {
                System.out.printf("%-27s%20.2f kr.%n", vare.getNavn() + " " + vare.getAntal() + " stk.", vare.getPris());
            } else {
                System.out.printf("%-27s%20.2f kr.%n", vare.getNavn(), vare.getPris());

            }
        }
        String streg2 = "-".repeat(51);
        System.out.println(streg2);
        String streg4 = "-".repeat(51);
        System.out.println(String.format("%s%42.2f kr.", moms, samletPrisMoms()) + "\n" + streg4);
        String streg3 = "-".repeat(51);
        String total = "total:".toUpperCase();
        System.out.println(String.format("%50s", total));
        System.out.printf("%46.2f kr.", samletPris());
        System.out.println("\n" + streg3);
    }

    public void tilføjVare(Vare vare) {
        vares.add(vare);
    }
}





