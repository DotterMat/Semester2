package Opg7;

public class Main {
    public static void main(String[] args) {
        System.out.println(dominoBlock(29));
    }

    public static int dominoBlock(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return dominoBlock(n - 1) + dominoBlock(n - 2);
        }
    }
}
