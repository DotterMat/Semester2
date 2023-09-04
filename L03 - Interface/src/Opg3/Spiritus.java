package Opg3;

public class Spiritus extends Vare {
    private String beskrivelse;
    private int alkoholProcent;


    public Spiritus(String navn, int vareNummer, String beskrivelse, int alkoholProcent, int pris,int antal) {
        super(navn, vareNummer, beskrivelse, pris,antal);
        this.beskrivelse = beskrivelse;
        this.alkoholProcent = alkoholProcent;
    }
   @Override
    public double getPris() {
       return super.getPris() + getMoms();
}
    @Override
    public double getMoms() {
        if (super.getPris() > 90) {
            return (super.getPris() * 120) / 100;
        }
        return (super.getPris() * 80) / 100;
    }
}



