package gætEtTal;

import java.util.Scanner;

public class GætEtTal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        System.out.println("Gæt et tal mellem 1 og 100");
        int user = scanner.nextInt();
        boolean forkertSvar = true;
        int count = 0;
        while (forkertSvar) {
            count++;
            if (user == randomNumber && user > 0 && user < 100) {
                System.out.println("Nemlig det er " + randomNumber + ". Du ramte rigtigt!" + " du gættede på trækNr: " + count);
                forkertSvar = false;
            } else if (user < randomNumber && user > 0 && user < 100) {
                System.out.println("Gæt et tal der er højere");
                user = scanner.nextInt();
            } else if (user > randomNumber && user > 0 && user < 100) {
                System.out.println("Gæt et tal der er mindre");
                user = scanner.nextInt();
            } else {
                System.out.println("Ugyldigt tal!");
                user = scanner.nextInt();
            }
            if (count == 5) {
                System.out.println("Beklager, du har brugt alle dine forsøg. Det korrekte tal var " + randomNumber + ".");
                break;
            }
        }
    }
}


