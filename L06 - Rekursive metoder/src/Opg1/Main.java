package Opg1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenCount = even(numberList);
        System.out.println("Count of even numbers: " + evenCount);


    }

    public static int even(List<Integer> numbers) {
        int count = 0;

        count = countNumbers(numbers,count,0);

        return count;
    }

    public static int countNumbers(List<Integer> numbers, int count, int index) {
        if (index == numbers.size()) {
            return count;
        }
        if (numbers.get(index) % 2 == 0) {
            count++;
        }
        return countNumbers(numbers, count, index + 1 );
    }
}