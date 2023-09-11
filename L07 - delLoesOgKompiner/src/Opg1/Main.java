package Opg1;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;

public class Main {
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
        int m = (l + h) / 2;
        int totalsum = 0;
        if (l <= m) {
            int sum1 = sum(list, l, m);
            int sum2 = sum(list, m + 1, h);
            if (sum1 > sum2) {
                return sum1;
            }



         (h >= m) {
            sum2 += sum(list, l, h);
        }
        return totalsum += sum1 + sum2;

    }
}

