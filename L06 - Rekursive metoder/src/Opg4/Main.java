package Opg4;

public class Main {
    public static void main(String[] args) {
        System.out.println(calcNo(7));
        System.out.println(calcNoIt(6));

    }

    // Rekursiv metode

    //no3 = no2 + no1 + 3 * no0
    // = 5 + 1 + 3 + 3 * 2
    public static int calcNo(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else if (n > 2 && n % 2 == 0) {
            return (2 * calcNo(n - 3) - calcNo(n - 1));
        } else {
            return calcNo(n - 1) + calcNo(n - 2) + 3 * calcNo(n - 3);
        }
    }

    //iterativ metode
    public static int calcNoIt(int n) {
        int[] result = new int[n];
        result[0] = 2;
        result[1] = 1;
        result[2] = 5;
        //i <= n er sekvensen fra (i det her tilfælde 3) og op til slutningen af det pågældende array
        for (int i = 3; i <= n; i++) {
            if(i % 2 == 0) {
                result[i] = 2 * result[i - 3] - result[i - 1];
            } else {
                result[i] = result[i - 1] + result[i - 2] + 3 * result[i - 3];
            }
        }
        return result[n];
    }
}

