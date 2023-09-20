package Opg2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        Consumer<Runner> printRunnerInfo = (runner) -> {
            System.out.println("Navn: " + runner.getName() + ", Lap Time: " + runner.getLapTime());
        };

        runners.forEach(printRunnerInfo);
        System.out.println();
        System.out.println("Runner that have a laptime < 30");
        System.out.println();
        Consumer<Runner> laptime = (runner) -> {
            if (runner.getLapTime() < 30) {

                System.out.println("Navn: " + runner.getName() + ", Lap Time: " + runner.getLapTime());
            }
        };
        System.out.println("Løbere før sortering:");
        runners.forEach(runner -> System.out.println("Navn: " + runner.getName() + ", Lap Time: " + runner.getLapTime()));
        System.out.println();

        runners.sort((runner1, runner2) -> Integer.compare(runner1.getLapTime(), runner2.getLapTime()));

        System.out.println("Løbere efter sortering:");
        runners.forEach(runner -> System.out.println("Navn: " + runner.getName() + ", Lap Time: " + runner.getLapTime()));


    }
}