package Opg3And4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mechanic m1 = new Mechanic("Tove", "Henriksenvej 22", 12, 220.4);
        Mechanic m2 = new Mechanic("Henrik", "Jørgensensvej 23", 11, 230.2);
        Foreman f1 = new Foreman("Jan Eriksen","jørgensensvej 22",2024,3333,12,230.0);
        Survoyer s1 = new Survoyer("Jens Tovesen", "LindeBerg", 12, 320, 21);

        ArrayList<Mechanic> list = new ArrayList<>();
        ArrayList<Survoyer> list2 = new ArrayList<>();
        list.add(s1);
        list.add(m1);
        list.add(m2);
        list2.add(s1);
        for(Mechanic m : list) {
            System.out.println(m.weeklySalary());
        }
        for (Survoyer s : list2) {
            System.out.println(s.weeklySalary());
        }
        }



    public static double totalWeeklySalary(ArrayList<Mechanic> list) {
        int total = 0;
        for (Mechanic mechanic : list) {
            total += mechanic.weeklySalary();
        }
        return total;
    }
}
