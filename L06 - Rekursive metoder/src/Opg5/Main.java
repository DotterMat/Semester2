package Opg5;

public class Main {
    public static void main(String[] args) {
            String word = "Christopher";
            System.out.println("Anagrams of \"" + word + "\":");
            printAnagrams(word);
    }

    public static void printAnagrams(String word) {
        printAnagramsRecursive("",word);
}
    public static void printAnagramsRecursive(String prefix, String word) {
        if (word.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < word.length(); i++) {

                char chosenChar = word.charAt(i);
                String newPrefix = prefix + chosenChar;
                String newWord = word.substring(0, i) + word.substring(i + 1);

                printAnagramsRecursive(newPrefix, newWord);
            }
        }
    }
}


    /*public static boolean isPalindrone(String s) {
        boolean result = true;
        if (s.length() > 1) {
            char charLast = (s.charAt(s.length() - 1));
            char charFirst = s.charAt(0);
            if (charFirst == charLast) {
                return isPalindrone(s.substring(1, s.length() -1));
            } else {
                return false;
            }
        }
        return result;

     */


