package Opg3;

import java.util.ArrayList;

public class Vare extends Indkøbsvogn {
    private String navn;
    private int vareNummer;
    private String beskrivelse;
    private double pris;

    public Vare(String navn, int vareNummer, String beskrivelse, double pris) {
        this.navn = navn;
        this.vareNummer = vareNummer;
        this.beskrivelse = beskrivelse;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public int getVareNummer() {
        return vareNummer;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    @Override
    public double getPris() {
        return pris;


    }

    @Override
    public double getMoms() {
        return (getPris() * 25) / 100;
    }

    public void addIndkøbskurv(Indkøbsvogn indkøbsvogn) {
        this.addIndkøbskurv(indkøbsvogn);
    }

    public String toString() {
        return String.format("%s", getNavn());
    }
    public String print() {
        return String.format("%s%27.2f",getNavn(),getPris()) + " kr.";
    }
    public double samletPris(ArrayList<Vare> varer) {
        double total = 0;
        for (Vare v : varer) {
            total += v.getPris();
        }
        return total;
    }

    public double samletPrisMoms(ArrayList<Vare> vares) {
        double total = 0;
        for (Vare v : vares) {
            total += v.getMoms();
        }
        return total;
    }
}




