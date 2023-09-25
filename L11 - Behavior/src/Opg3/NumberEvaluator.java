package Opg3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberEvaluator implements Evaluator {
    /** Returns true, if s contains a valid integer or decimal number. */
    @Override
    public boolean isValid(String s) {
        Pattern pattern = Pattern.compile(
                "^[+-]?\\\\d*(\\\\.\\\\d+)?([eE][+-]?\\\\d+)?$"
        );
        Matcher matcher = pattern.matcher(s);
        return s.matches(s);
    }
}
