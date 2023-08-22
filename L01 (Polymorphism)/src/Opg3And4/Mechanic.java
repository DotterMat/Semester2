package Opg3And4;

public class Mechanic extends Person{
    private int svendeprøve;
    private double timelønsats;

    public Mechanic(String navn, String adresse, int svendeprøve, double timelønsats) {
        super(navn, adresse);
        this.svendeprøve = svendeprøve;
        this.timelønsats = timelønsats;
    }

    public int getSvendeprøve() {
        return svendeprøve;
    }

    public double getTimelønsats() {
        return timelønsats;
    }
    public double weeklySalary() {
        return this.timelønsats * 37;
    }
}
