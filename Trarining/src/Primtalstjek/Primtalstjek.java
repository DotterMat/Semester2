package Primtalstjek;

import java.security.KeyStore;

public class Primtalstjek {
    public static void main(String[] args) {
        int tal = 5;
        primtal(5);

    }

    public static void primtal(int tal) {
        for (int i = 2; i < Math.sqrt(tal); i++) {
            if (tal % i == 0) {
                System.out.println(tal + " er ikke et primtal");
            }
        }
        System.out.println(tal + " er et primtal");
    }
}