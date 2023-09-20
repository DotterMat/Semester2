package Opg4A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainGjoengeHoevdingen {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\mathi\\IdeaProjects\\Semester2\\L09 - HashSet\\src\\Opg4A\\GjoengeHoevdingen.txt");
            Scanner reader = new Scanner(myObj);
            Set<String> words = new TreeSet<>();
            int count = 0;

            while (reader.hasNextLine()) {
               String line = reader.nextLine();
               String[] lineWords = line.split(" ");
                for(String word : lineWords) {
                    if(!word.isEmpty()) {
                        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                        words.add(word);
                        count++;
                    }
                }
            }
            System.out.println("Der er " + words.size() + " unikke ord");
            System.out.println("Der er " + count + " ord i alt");
            reader.close();

        } catch (
                FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

}
