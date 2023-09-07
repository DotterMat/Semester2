package Opg2;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%2s", "m");
        for (int m = 0; m <= 7; m++) {
            System.out.printf("%4d", m);
        }
        String streg = "-".repeat(40);
        System.out.print("\nn" + streg + "\n");
        for (int n = 0; n <= 7; n++) {
            System.out.printf("%d |", n);

            for (int m = 0; m <= n; m++) {
                int result = biominal(n, m);
                System.out.printf("%4d", result);
            }
            System.out.println();
        }
    }

    public static int biominal(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        } else if (0 < m && m < n) {
            return biominal(n - 1, m) + biominal(n - 1, m - 1);
        }
        return 0;
    }

}
