package ordination;

import java.util.ArrayList;

public class Patient {
    private final String cprNr;
    private final String navn;
    private final double vægt;

    //link til Ordination --> 0..*
    private final ArrayList<Ordination> ordinationer = new ArrayList<>();

    public Patient(String cprNr, String navn, double vægt) {
        this.cprNr = cprNr;
        this.navn = navn;
        this.vægt = vægt;
    }

    public ArrayList<Ordination> getOrdinationer() {
        return ordinationer;
    }
    public void addOrdination(Ordination ordination){
        ordinationer.add(ordination);
    }

    public double getVægt() {
        return vægt;
    }

    @Override
    public String toString() {
        return navn + "  " + cprNr;
    }
}
