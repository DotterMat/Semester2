package Opg5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Handler;

public class filmOgKaraktere {
    public static void main(String[] args) {
        Map<String, List<Integer>> filmratings = new HashMap<>();

        try {
            File file = new File("C:\\Users\\mathi\\IdeaProjects\\Semester2\\L10 - Lambda\\src\\Opg5\\filmanmeldelser.txt");
            Scanner scanner = new Scanner(file);
            int numRating = Integer.parseInt(scanner.nextLine());
            String currentFilm = null;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (currentFilm == null) {
                    currentFilm = line;
            } else {
                    int rating = Integer.parseInt(line);
                    if (!filmratings.containsKey(currentFilm)) {
                        filmratings.put(currentFilm, new ArrayList<>());
                    }
                    filmratings.get(currentFilm).add(rating);
                    currentFilm = null;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String,List<Integer>> entry : filmratings.entrySet()) {
            String filmName = entry.getKey();
            List<Integer> ratings = entry.getValue();
            int numRatings = ratings.size();
            double averageRating = calculateAverage(ratings);
            System.out.printf("%s: %d karakterer, gennemsnit %.1f%n", filmName, numRatings, averageRating);
        }
    }
    private static double calculateAverage(List<Integer> ratings) {
        if(ratings.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (int rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }
}
