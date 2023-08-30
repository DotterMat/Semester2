package Opg3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fødevare extends Vare {
    private LocalDate holdbarhedsDato;


    private ArrayList<Vare> varer = new ArrayList<>();

    public Fødevare(String navn, int vareNummer, String beskrivelse, LocalDate holdbarhedsDato, double pris) {
        super(navn, vareNummer, beskrivelse, pris);
        this.holdbarhedsDato = holdbarhedsDato;
    }

    public LocalDate getHoldbarhedsDato() {
        return holdbarhedsDato;
    }

    @Override
    public double getPris() {
        return super.getPris() + getMoms();
    }

    @Override
    public double getMoms() {
        return (super.getPris() * 5) / 100;
    }



    }



