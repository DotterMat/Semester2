package Opg4;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("ged"));
        System.out.println(reverse("Andreas"));
        System.out.println("Kristine" + " " + reverse("Kristine"));

    }

    public static String reverse(String s) {
        String s2 = s;
        if (s.length() > 1) {
            char charLast = (s.charAt(s.length() - 1));
            char chatFirst = (s.charAt(0));

            s2 = charLast + reverse(s.substring(1, s2.length() - 1)) + chatFirst;
        }
        return s2;
    }


}

