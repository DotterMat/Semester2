package ordFrekvens;

import java.sql.SQLOutput;
import java.util.*;

public class OrdFrekvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast en tekst: ");
        String inputText = scanner.nextLine();

        String[] words = inputText.split(" ");
        List<String> normalizedWords = new ArrayList<>();

        for (String word : words) {
            word = word.replaceAll("[.,!?']", "");
            word = word.toLowerCase();
            normalizedWords.add(word);
        }
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : normalizedWords) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word,1);
            }
        }
        System.out.println("Ordfrekvens:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " gang(e)");
        }
    }
}

