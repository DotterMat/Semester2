package tælBogstaver;

import java.util.*;

public class TælBogstaver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Indtast en tekst: ");

            String user = scanner.nextLine();
            String[] words = user.split(" ");
            List<String> normalizedWords = new ArrayList<>();

            for (String word : words) {
                word = word.replaceAll("[.,!?]", "");
                word = word.toLowerCase();
                normalizedWords.add(word);
            }

            Map<String, Integer> letterCountMap = new HashMap<>();

            for (String word : normalizedWords) {
                for (int i = 0; i < word.length(); i++) {
                    String letter = String.valueOf(word.charAt(i));
                    if (letterCountMap.containsKey(letter)) {
                        letterCountMap.put(letter, letterCountMap.get(letter) + 1);
                    } else {
                        letterCountMap.put(letter, 1);
                    }
                }
            }

            System.out.println("Bogstavfrekvens:");
            for (Map.Entry<String, Integer> entry : letterCountMap.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " gang(e)");
            }
        }
    }