package Opg4B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2GjoengeHoevdingen {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\mathi\\IdeaProjects\\Semester2\\L09 - HashSet\\src\\Opg4B\\GjoengeHoevdingen.txt");
            Scanner reader = new Scanner(myObj);
            Map<String, Integer> words = new TreeMap<>();
            int totalWords = 0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] lineWords = line.split(" ");
                for (String word : lineWords) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        if (words.containsKey(word)) {
                            words.put(word, words.get(word) + 1);
                        } else {
                            words.put(word, 1);
                        }
                        totalWords++;
                    }
                }
            }

            System.out.println("Ord med count >= 1000:");
            for (Map.Entry<String, Integer> entry : words.entrySet()) {
                if (entry.getValue() >= 1000) {
                    System.out.println("Ord: " + entry.getKey() + ", Count: " + entry.getValue());
                }
            }

            System.out.println("Antal ord totalt: " + totalWords);
            System.out.println("Antal forskellige ord: " + words.size());

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
