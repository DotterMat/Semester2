package Trying;

public class Print {

    private int tal = 1;
    public static void main(String[] args) {
        String type = "Brød".toUpperCase();
        String type2 = "Fisk".toUpperCase();
        String type3 = "cm".toUpperCase();
        String type4 = "kcal";
        int tal = 1;
        double tax = 0;

        String streg = "-".repeat(60);
        System.out.printf("%20s%n",streg,tal);
        System.out.printf("%12s:%15f%7s%23d%4s%n", type,tax ,type4, tal,type3);
        System.out.printf("%12s:%15f%7s%23d%4s", type2,tax,type4,tal,type3);
        System.out.println(" ");
        String streg2 = "-".repeat(60);
        System.out.printf("%20s%n",streg2,tal);



    }
}
//System.out.printf("%20s:%6.2f%n",name,price);