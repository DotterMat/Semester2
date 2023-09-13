package Opg2;

import java.util.ArrayList;
import java.util.List;

public class MainZeroCount {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,0,0,0,4,3,0,1));
        int zeroCount = countTheElement(list);
        System.out.println("Number of zeros: " + zeroCount);
    }

    public static int countTheElement(ArrayList<Integer> list) {
        return countTheElement(list, 0, list.size() - 1);
    }
    private static int countTheElement(ArrayList<Integer> list, int l, int h) {
        if (l > h) {
            return 0;
        }
        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int mid = (l + h) / 2;
        int leftCount = countTheElement(list, l, mid);
        int rightCount = countTheElement(list, mid + 1, h);

        return leftCount + rightCount;
    }
}

