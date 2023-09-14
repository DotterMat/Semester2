package Opg3;

import java.util.ArrayList;

public class Vare {
    private String navn;
    private int vareNummer;
    private String beskrivelse;
    private double pris;
    private int antal;

    public Vare(String navn, int vareNummer, String beskrivelse, double pris, int antal) {
        this.navn = navn;
        this.vareNummer = vareNummer;
        this.beskrivelse = beskrivelse;
        this.pris = pris;
        this.antal = antal;
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


    public double getPris() {
        return antal * pris;
    }


    public int getAntal() {
        return antal;
    }

    public double getMoms() {
        return (this.pris * 25) / 100;
    }

    public void addIndkøbskurv(Indkøbsvogn indkøbsvogn) {
        this.addIndkøbskurv(indkøbsvogn);
    }
}




