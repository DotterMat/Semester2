package Opg3;

public class Foreman extends Mechanic {
    private int årForUdnævnelse;
    private int bonus;


    public Foreman(String navn, String adresse, int årForUdnævnelse, int bonus, int svendeprøve, double timelønsats) {
        super(navn,adresse,svendeprøve,timelønsats);
        this.årForUdnævnelse = årForUdnævnelse;
        this.bonus = bonus;
    }

    public int getÅrForUdnævnelse() {
        return årForUdnævnelse;
    }

    public int getBonus() {
        return bonus;
    }

    public double weeklySalary2(int weeklySalary) {
        return super.weeklySalary() + bonus;

    }
}
