package Opg2Og3;

import Opg1.LinkedStack23Y;
import Opg1.Stack23Y;

import java.util.Stack;

public class ParentiesAndBrackets {
    private static Stack<Character> mainStak = new Stack<>();

    public static boolean parentees(String input) {
        Stack23Y<Character> stak = new LinkedStack23Y<>(mainStak);
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stak.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stak.isEmpty()) {
                    return false;
                }
            } else if (!(stak.pop() == '(' && ch == ')' || stak.pop() == '{' && ch == '}' || stak.pop() == '[' && ch == ']')) {
                return false;
            }
        }
        return stak.isEmpty();
    }
    public static boolean palindrome(String s) {
        s = s.toLowerCase();
        Stack23Y<Character> stak = new LinkedStack23Y<>(mainStak);
        for (int i = 0; i < s.length(); i++) {
            stak.push(s.charAt(i));
        }
        String reverse = "";
       while (!stak.isEmpty()) {
           reverse = reverse + stak.pop();
       }
        return s.equals(reverse);
    }
}


