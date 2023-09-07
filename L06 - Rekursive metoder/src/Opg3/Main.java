package Opg3;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrone("otto"));
        System.out.println(isPalindrone("sandal"));
        System.out.println(isPalindrone("racecar"));
        System.out.println(isPalindrone("noah"));

    }

    public static boolean isPalindrone(String s) {
        boolean result = true;
        if (s.length() > 1) {
            char charLast = (s.charAt(s.length() - 1));
            char charFirst = s.charAt(0);
            if (charFirst == charLast) {
                return isPalindrone(s.substring(1, s.length() -1));
            } else {
                return false;
            }
        }
        return result;
    }
}
