package Opg3;

import java.util.ArrayList;

public class Vare extends Indkøbsvogn {
    private String navn;
    private int vareNummer;
    private String beskrivelse;
    private double pris;
    private Indkøbsvogn indkøbsvogn;

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


    public double getPris() {
        return pris;


    }

    public double getMoms() {
        return (getPris() * 25) / 100;
    }

    @Override
    public void tilføjVare(Vare vare) {
        super.tilføjVare(vare);
    }


}





