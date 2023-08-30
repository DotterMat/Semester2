package Opg3;

public class Elartikel extends Vare {
    private int gennemsnitligEnergiPrTime;

    public Elartikel(String navn, int vareNummer, String beskrivelse, double pris, int gennemsnitligEnergiPrTime) {
        super(navn, vareNummer, beskrivelse, pris);
        this.gennemsnitligEnergiPrTime = gennemsnitligEnergiPrTime;
    }

    public int getGennemsnitligEnergiPrTime() {
        return gennemsnitligEnergiPrTime;
    }

    @Override
    public double getPris() {
        return super.getPris() + getMoms();
    }

    @Override
    public double getMoms() {
        if (super.getPris() > 3) {
            return (super.getPris() * 30) / 100;
        }
        return super.getPris();
    }



}


