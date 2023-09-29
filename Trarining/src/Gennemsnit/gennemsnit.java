package Gennemsnit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gennemsnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        List<Integer> integers = new ArrayList<>();
        System.out.println("Skriv et antal tal: ");
        int user = scanner.nextInt();
        System.out.println("Du har valgt " + user + " tal, skriv nu de tal du ønsker at finde gennemsnittet af:");
        for (int i = 0; i < user; i++) {
            System.out.println("Indtast tal: ");
            int valg = scanner.nextInt();
           integers.add(valg);
        }
        System.out.println("Gennemsnittet af tallene er: " + average(integers));
    }

    public static double average(List<Integer> gennemsnit) {
        double totalSum = 0;
        double count = 0;
        for (int i = 0; i < gennemsnit.size(); i++) {
            totalSum += gennemsnit.get(i);
            count++;
        }
        return totalSum / count;
    }
}

