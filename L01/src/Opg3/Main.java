package Opg3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mechanic m1 = new Mechanic("Tove", "Henriksenvej 22", 12, 220.4);
        Mechanic m2 = new Mechanic("Henrik", "Jørgensensvej 23", 11, 230.2);
        Foreman f1 = new Foreman(12, 10, "Jan Henriksen", "grønskudsvej 72");
        Survoyer s1 = new Survoyer("Jens Tovesen","LindeBerg",12,30,21);

        ArrayList<Mechanic> list = new ArrayList<>();
        list.add(s1);
        list.add(m1);
        list.add(m2);

    }

    public static double totalWeeklySalary(ArrayList<Mechanic> list) {
        int total = 0;
        for (Mechanic mechanic : list) {
            total += mechanic.weeklySalary();
        }
        return total;
    }
