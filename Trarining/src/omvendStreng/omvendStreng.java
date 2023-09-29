package omvendStreng;

public class omvendStreng {
    public static void main(String[] args) {
        String navn = "jens tidmads";
        System.out.println(omvendt(navn));

    }

    public static String omvendt(String s) {
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }
        return s2;
    }
}



