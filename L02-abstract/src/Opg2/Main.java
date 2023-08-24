package Opg2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figur cirkel = new Cirkel(24,24);
        Figur ellipse = new Ellipse(14,14);


        ArrayList<Figur> figur = new ArrayList<>();
        figur.add(ellipse);
        figur.add(cirkel);
        for(Figur f : figur) {
            System.out.println(figur.toString());

        }
    }
}
