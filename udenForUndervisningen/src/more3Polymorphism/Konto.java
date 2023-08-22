package more3Polymorphism;

import java.util.ArrayList;

public class Konto {
    private String kontonummer;
    private double saldo;

    public Konto(String kontonummer) {
        this.kontonummer = kontonummer;
    }
    public void hævPenge(double beløb) {
        if(beløb <= saldo) {
            saldo -= beløb;
        } else {
            System.out.println("Du har ikke nok penge på din konto");
        }
    }
    public void deponerePenge(double beløb) {
        saldo += beløb;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = 0.0;
    }
}
