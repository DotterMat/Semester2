package Opg2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figur cirkel = new Cirkel(24, 24);
        Figur ellipse = new Ellipse(15, 16, 13, 20);
        Figur kvardrat = new Kvardrat(15,17);
        Figur retangles = new Retangel(16,22);


        ArrayList<Ellipse> ellipses = new ArrayList<>();
        ellipses.add((Ellipse) ellipse);
        for (Ellipse e : ellipses) {
            System.out.println(e.toString());
        }
        ArrayList<Kvardrat> kvardrats = new ArrayList<>();
        kvardrats.add((Kvardrat) kvardrat);
        for (Kvardrat k : kvardrats) {
            System.out.println(k.toString());
        }
        ArrayList<Cirkel> cirkels = new ArrayList<>();
        cirkels.add((Cirkel) cirkel);
        for(Cirkel c : cirkels) {
            System.out.println(c.toString());
        }
        ArrayList<Retangel> retangels = new ArrayList<>();
        retangels.add((Retangel) retangles);
        for(Retangel r : retangels) {
            System.out.println(r.toString());
        }


    }

}

