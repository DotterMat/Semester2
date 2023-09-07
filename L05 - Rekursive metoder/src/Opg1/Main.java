package Opg1;

public class Main {
    public static void main(String[] args) {
        //1! = 1        factorial(1) = 1
        // n! = n*(n-1))   factorial(n) = n*factorial(n-1)
        for (int n = 1; n <= 10; n++) {
            System.out.println(factional(n));
        }

    }

    public static long factional(int n) {
        long result;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factional(n - 1);
        }
        return result;
    }

    public static long factional1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factional(n - 1);
        }
    }
}