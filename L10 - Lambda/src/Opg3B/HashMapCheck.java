package Opg3B;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCheck {
    public static void main(String[] args) {
        Map<Integer,Integer> numbers = new HashMap<>();
        numbers.put(2,4);
        numbers.put(3,9);
        numbers.put(4,16);
        numbers.put(5,25);
        numbers.put(6,36);
        Iterator<Integer> keyIterator = numbers.keySet().iterator();

        System.out.println("Par i map: ");
        //tjekker, om der er flere nøgler tilbage i map'en at iterere over.
        while (keyIterator.hasNext()) {
            int key = keyIterator.next();
            int value = numbers.get(key);
            System.out.printf("(%d, %d) ", key,value);
        }
    }

}
