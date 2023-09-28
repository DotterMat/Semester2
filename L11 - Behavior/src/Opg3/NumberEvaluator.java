package Opg3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberEvaluator implements Evaluator {
    /** Returns true, if s contains a valid integer or decimal number. */
    public boolean isValid(String s) {
        //TODO
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
