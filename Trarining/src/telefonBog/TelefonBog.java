package telefonBog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonBog {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            HashMap<String, Integer> kontakt = new HashMap<>();
            boolean kør = true;

            while (kør) {
                System.out.println("Menu:");
                System.out.println("1. Tilføj en kontakt");
                System.out.println("2. Søg efter en kontakt");
                System.out.println("3. Slet en kontakt");
                System.out.println("4. Vis hele telefonbogen");
                System.out.println("0. Afslut programmet");

                int valg = scanner.nextInt();
                scanner.nextLine(); // Ryd inputbufferen

                if (valg == 1) {
                    tilføjKontakt(scanner, kontakt);
                } else if (valg == 2) {
                    søgEfterKontakt(scanner, kontakt);
                } else if (valg == 3) {
                    sletKontakt(scanner, kontakt);
                } else if (valg == 4) {
                    visTelefonbog(kontakt);
                } else if (valg == 0) {
                    kør = false;
                } else {
                    System.out.println("Ugyldigt valg. Prøv igen.");
                }
            }

            System.out.println("Programmet afsluttes.");
        }

        private static void tilføjKontakt(Scanner scanner, HashMap<String, Integer> kontakt) {
            System.out.println("Indtast navn på kontakten: ");
            String navn = scanner.nextLine();
            System.out.println("Indtast telefonnummer: ");
            int telefonnummer = scanner.nextInt();
            kontakt.put(navn, telefonnummer);
            System.out.println("Kontakten " + navn + " er blevet tilføjet til telefonbogen.");
        }

        private static void søgEfterKontakt(Scanner scanner, HashMap<String, Integer> kontakt) {
            System.out.println("Indtast navn på kontakten: ");
            String navn = scanner.nextLine();
            if (kontakt.containsKey(navn)) {
                int telefonnummer = kontakt.get(navn);
                System.out.println("Telefonnummeret for " + navn + " er: " + telefonnummer);
            } else {
                System.out.println("Der er ikke nogen med navnet: " + navn);
            }
        }

        private static void sletKontakt(Scanner scanner, HashMap<String, Integer> kontakt) {
            System.out.println("Indtast navn på kontakten, du vil slette: ");
            String navn = scanner.nextLine();
            if (kontakt.containsKey(navn)) {
                kontakt.remove(navn);
                System.out.println("Kontakten " + navn + " er blevet slettet fra telefonbogen.");
            } else {
                System.out.println("Der er ingen kontakt med navnet: " + navn);
            }
        }

        private static void visTelefonbog(HashMap<String, Integer> kontakt) {
            System.out.println("Telefonbogen:");
            if (kontakt.isEmpty()) {
                System.out.println("Telefonbogen er tom.");
            } else {
                for (Map.Entry<String, Integer> entry : kontakt.entrySet()) {
                    System.out.println("- " + entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }
