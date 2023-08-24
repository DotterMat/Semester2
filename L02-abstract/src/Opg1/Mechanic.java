package Opg1;

public class Mechanic extends Employee {
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


