package Opg3;

import java.util.ArrayList;

public class Foreman extends Mechanic {
    private int årForUdnævnelse;
    private int bonus;


    public Foreman(int årForUdnævnelse, int bonus, String navn, String adresse) {
        super(navn, adresse);
        this.årForUdnævnelse = årForUdnævnelse;
        this.bonus = bonus;
    }

    public int getÅrForUdnævnelse() {
        return årForUdnævnelse;
    }

    public int getBonus() {
        return bonus;
    }

    public double weeklySalary(int weeklySalary) {
        return super.weeklySalary() + bonus;

    }
}
