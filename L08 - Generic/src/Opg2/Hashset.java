package Opg2;

import java.util.Set;
import java.util.HashSet;
public class Hashset {
    public static <E, T> HashSet<T> union(Set<E> set1, Set<E> set2) {
        HashSet<T> result = new HashSet<>();

        for (E element : set1) {
            result.add((T) element);
        }
        for (E element : set2) {
            result.add((T) element);
        }
        return result;
    }
}
