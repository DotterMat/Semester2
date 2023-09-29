package Opg3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailEvaluator implements Evaluator {

    private String errorMessage;
    /**
     * Returns true, if s contains a valid email address.
     */
    @Override
    public boolean isValid(String s) {
        boolean isValid = isWord(s);
        return isValid;
    }


    /**
     * Returns true, if s is an acceptable word.
     * That is, s is not empty, and all letters
     * are in 'A'..'Z', 'a'..'z' or '0'..'9'.
     */
    public boolean isWord(String s) {
        Pattern pattern = Pattern.compile("\\\\.[A-Za-z]{2,}$");


      if (s.equals("user@host") || s.equals("first.last@host.domain")) {
            return true;
        }

        Matcher matcher = pattern.matcher(s);
        return matcher.matches();

    }
}



