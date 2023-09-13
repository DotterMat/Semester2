package src.Opg3;

import java.util.ArrayList;
import java.util.List;

public class MainMerge {
    /* The paper on Divide-Solve-Combine contains most of the code necessary to do a merge sort.
     The implementation of the method merge() is missing.
     Write the merge() method.
     Test your merge sort on [8, 56, 45, 34, 15, 12, 34, 44]

     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(8, 56, 45, 34, 15, 12, 34, 44));
        System.out.println("Original list: " + list);

        mergesort(list, 0, list.size() - 1);

        System.out.println("Sorted list: " + list);
    }
    private static void mergesort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(list, low, middle);
            mergesort(list, middle + 1, high);
            merge(list, low, middle, high);
        }
    }

    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        int n1 = middle - low + 1;
        int n2 = high - middle;
        //Laver 2 midlertidige lister
        ArrayList<Integer> left = new ArrayList<>(n1);
        ArrayList<Integer> right = new ArrayList<>(n2);

        // i for den venstre liste
        for (int i = 0; i < n1; i++) {
            left.add(list.get(low + i));
        }
        // j for den højre list
        for (int j = 0; j < n2; j++) {
            right.add(list.get(middle + 1 + j));
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left.get(i) <= right.get(j)) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, right.get(j));
            j++;
            k++;
        }
    }
}