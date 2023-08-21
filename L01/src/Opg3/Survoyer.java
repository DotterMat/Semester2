package Opg3;

public class Survoyer extends Mechanic{
    private int synPrUge;

    public Survoyer(String navn, String adresse, int svendeprøve, double timelønsats, int synPrUge) {
        super(navn, adresse, svendeprøve, timelønsats);
        this.synPrUge = synPrUge;
    }

    public double antalSynPrUge() {
        return super.weeklySalary() + synPrUge * 29;
    }
}
