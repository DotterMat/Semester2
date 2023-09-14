package src.occuences;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] list = {2,5,10,14,30,49};
        System.out.println(occuences(list));

    }

    public static int[] occuences(int[] list) {
        int count = 0;
        for (int i = 1; i < 50; i++) {
            if (list[i] == i) {
                count++;
            }
            if (list[i] > 2) {
                System.out.println("occurs");
        } else {
                System.out.println("occur");
            }
        }
        return list;
    }

}
