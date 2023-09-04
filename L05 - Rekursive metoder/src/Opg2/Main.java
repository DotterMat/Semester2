package Opg2;

public class Main {
    public static void main(String[] args) {
        //n(0) = 1
        //System.out.println(power(n, p));
        System.out.println(power1(5, 6));
    }



    public static int power(int n, int p) {
        int result;
        if (p == 0) {
            result = 1;
        } else {
            result = n * (power(n, p - 1));

        }
        return result;
    }

    public static int power1(int n, int p) {
        if (p == 0)
            return 1;
        else if (p % 2 != 0)
            return power1(n, p - 1) * n;
        else {
            {
                return power1(n * n, p / 2);
            }
        }
    }

}
