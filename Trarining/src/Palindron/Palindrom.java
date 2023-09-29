package Palindron;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast en streng:");
        String user = scanner.nextLine();
        System.out.println("Du valgte " + user);
        palindrom(user);

    }

    public static void palindrom(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if (s.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println(s + " er et palindrom");
        } else {
            System.out.println(s + " er ikke et palindrom");
        }
    }
}
