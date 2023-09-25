import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> arrMaps = new HashMap<>();
        Iterator<Integer> iterator = (Iterator<Integer>) arrMaps.keySet();
        while(iterator.hasNext()) {
            arrMaps = (Map<String, Integer>) Collections.singleton(iterator.next());
            System.out.println(arrMaps);
        }
    }
}