package Opg6;

public class Main {
    public static void main(String[] args) {

    }
    public static int greatestDivisor(int a, int b) {
        if(b <= a && a%b == 0) {
            return b;
        } else if (a < b) {
            return greatestDivisor(b, a);
        } else {
            return greatestDivisor(b,a % b);
        }
    }
}
