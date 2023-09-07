package Opg4;

import java.sql.SQLClientInfoException;

public class Main {
    public static void main(String[] args) {
        System.out.println(sequenceNumber(6));

    }

    // Rekursiv metode
    public static int sequenceNumber(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else if (n > 2 && n % 2 == 0) {
            return (2 * sequenceNumber(n - 3) - sequenceNumber(n - 1));
        } else {
            return sequenceNumber(n - 1) + sequenceNumber(n - 2) + 3 * sequenceNumber(n - 3);
        }
    }


    //iterativ metode
    public static int sequenseIterative(int n) {
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

