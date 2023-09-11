package Opg5;

public class Main {
    public static void main(String[] args) {
            String word = "kate";
            System.out.println("Anagrams of " + word + ":");
            printAnagrams(word);
    }

    public static void printAnagrams(String word) {
        printAnagramsRecursive("",word);
}
   private static void printAnagramsRecursive(String prefix, String word) {
        if (word.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < word.length(); i++) {
                //vælger en karakter i word for hver iteration
                char chosenChar = word.charAt(i);
                String newPrefix = prefix + chosenChar;
                String newWord = word.substring(0, i) + word.substring(i + 1);

                printAnagramsRecursive(newPrefix, newWord);
            }
        }
    }
}

