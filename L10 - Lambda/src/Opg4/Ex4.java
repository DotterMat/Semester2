package Opg4;

import Opg1.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex4 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();

        // OBS: Throws exception.
        //Fejlen opstår fordi du forsøger at ændre i listen "runners" ved at fjerne elementer fra den, imens du iterere igennem foreach løkken. Der kan derfor bruges en iterator.
        Iterator<Runner> iterator = runners.iterator();
        while (iterator.hasNext()) {
            Runner runner = iterator.next();
            if (runner.getLapTime() >= 40) {
                iterator.remove();

            }
        }
        System.out.println(runners);
        System.out.println();

        boolean removed = removeIf(runners, r -> r.getLapTime() >= 40);

        if(removed) {
            System.out.println("Mindst en løber er blevet fjernet");
        } else {
            System.out.println("Ingen løber er blevet fjernet");
        }

        System.out.println("Runners efter fjernelse");
        runners.forEach(Ex4::printRunnerInfo);
    }

    static void printRunnerInfo(Runner runner) {
        System.out.println("Navn: " + runner.getName() + ", Lap Time: " + runner.getLapTime());
    }
    public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter) {
        Iterator<Runner> iterator = runners.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Runner runner = iterator.next();
            if (filter.test(runner)) {
                iterator.remove();
                removed = true;
            }

        }
        return removed;
    }

}