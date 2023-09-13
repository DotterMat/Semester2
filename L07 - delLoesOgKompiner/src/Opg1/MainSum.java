package Opg1;

import java.util.ArrayList;

public class MainSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(7);
        System.out.println(sum(list));
    }


    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0, list.size() - 1);
    }

    private static int sum(ArrayList<Integer> list, int l, int h) {
        int totalsum = 0;
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int sum1 = sum(list, l, m);
            int sum2 = sum(list, m + 1, h);
            return totalsum += sum1 + sum2;
        }
    }
}

