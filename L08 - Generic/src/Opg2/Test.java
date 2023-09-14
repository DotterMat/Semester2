package Opg2;

import java.util.HashSet;

import static Opg2.Hashset.union;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> unionSet = union(set1,set2);

        System.out.println("Union of set1 and set2: " + unionSet);
    }

}
