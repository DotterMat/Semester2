package Opg4C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main3GjoengeHoevdingen {
    public static void main(String[] args) {
        try {
            File myObj = new File("GjoengeHoevdingen.txt");
            Scanner reader = new Scanner(myObj);
            Map<Integer, Set<String>> words = new LinkedHashMap<>();

            while (reader.hasNext()) {
                String word = reader.next();
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                int hashCode = word.hashCode();

                if (words.containsKey(hashCode)) {
                    Set<String> wordSet = words.get(hashCode);
                    wordSet.add(word);
                } else {
                    Set<String> wordSet = new HashSet<>();
                    wordSet.add(word);
                    words.put(hashCode, wordSet);
                }
            }

            for (Map.Entry<Integer, Set<String>> entry : words.entrySet()) {
                System.out.println("Hash Code: " + entry.getKey());
                System.out.println("Ord: " + entry.getValue());
            }

            for (Map.Entry<Integer, Set<String>> entry : words.entrySet()) {
                if (entry.getValue().size() > 1) {
                    System.out.println("Hash Code: " + entry.getKey());
                    System.out.println("Ord " + entry.getValue());
                }
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
