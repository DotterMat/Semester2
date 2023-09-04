package Opg2;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%s", "m");
        for (int m = 0; m <= 7; m++) {
            System.out.printf("%4d", m);
        }
        String streg = "-".repeat(40);
        System.out.print("\nn" + streg + "\n");
        for (int n = 0; n <= 7; n++) {
            System.out.println(n + String.format("%1s", " |") + String.format("%2d", biominal(0, 0)) +
                    String.format("%4d", biominal(1,1)));
        }

    }


    public static int biominal(int n, int m) {
        if (m == 1 || m == n) {
            return 1;
        } else if (0 < m && m < n) {
            return biominal(n - 1, m) + biominal(n - 1, m - 1);
        }
        return biominal(n - 1, m) + biominal(n - 1, m - 1);
    }
}
