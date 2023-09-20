package Opg1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Measurable m1 = new Chili("Carolina reaper", 1000000);
        Measurable m2 = new Chili("Ghost Pebber", 500000);
        Measurable m3 = new Chili("foodMommy", 600000);
        Measurable m4 = new Chili("Food Fatty", 2000);
        Measurable b1 = new Beer("Rowski ", 4.6);
        Measurable b2 = new Beer("Castle", 6.8);
        Measurable b3 = new Beer("Kwebber",10.8);
        Measurable b4 = new Beer("Settler",15.3);
        Measurable[] sand = {m1, m2, m3, m4};
        Measurable[] sand2 = {b1,b2,b3,b4};
        Measurable[] result = Beer.blackFridayMeal(sand, sand2);
        System.out.println(Arrays.deepToString(result));

        System.out.println("The average sconeville number is: " + average(sand));
        System.out.println("The largest spiciest chilli is: " + max(sand).getMeasure());

        Filter filter = new Filter() {
            @Override
            public boolean accept(Measurable x) {
                return ((Chili) x).getStyrke() > 5000;
            }
        };

        System.out.println("Gennemsnittet af chillierne med styrken over 5000 er: " + averagelimit(sand, filter));


    }

    public static double average(Measurable[] objects) {
        double sum = 0;
        double divisor = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
            divisor = sum / objects.length;
        }
        return divisor;

    }

    public static Measurable max(Measurable[] objects) {
        Measurable largest = objects[0];
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getMeasure() > largest.getMeasure()) {
                largest = objects[i];
            }
        }
        return largest;
    }
    public static double averagelimit(Measurable[] objects, Filter filter) {
        int sum = 0;
        int count = 0;
        Measurable object = objects[0];
        for (int i = 0; i < objects.length; i++) {
            if (filter.accept(objects[i])) {
                sum += (int) objects[i].getMeasure();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}
