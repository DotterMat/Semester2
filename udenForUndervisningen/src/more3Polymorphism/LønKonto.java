package more3Polymorphism;

public class LønKonto extends Konto{
    private int månedsløn;

    public LønKonto(String kontonummer, int månedsløn) {
        super(kontonummer);
        this.månedsløn = månedsløn;
    }
    public void tilføjMånedsløm(double beløb) {
        deponerePenge(beløb);
    }

}
