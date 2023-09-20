package Opg3A;

import java.util.ArrayList;
import java.util.List;
public class Iterator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        java.util.Iterator<Integer> iterator = numbers.iterator();

        System.out.println("Tal i listen: ");
        while (iterator.hasNext()) {
            Integer number = (Integer) iterator.next();
            System.out.println(number);
        }
    }
}

