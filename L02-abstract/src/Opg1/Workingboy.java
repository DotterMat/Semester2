package Opg1;

import java.util.ArrayList;

public class Workingboy extends Employee{
    private double løn;

    public Workingboy(String navn, String adresse, double løn) {
        super(navn, adresse);
        this.løn = løn;
    }

    public double totalWeeklySalary( ArrayList<Workingboy> employees) {
        int total = 0;
        for (Workingboy e : employees) {
            total += weeklySalary();
        }
        return total;
    }
    public double weeklySalary() {
        return løn * 25.0;

    }
}

