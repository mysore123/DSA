package stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if ((c == '(') || (c == '{') || (c == '[')) {
                stack.push(c);
            } else if ((c == ')') || (c == ']') || (c == '}')) {
                if (stack.isEmpty()) return false;
                if (checkCondition(c, stack.peek())) {
                    stack.pop();
                } else return false;
            }

        }
        return stack.isEmpty();
    }

    public static boolean checkCondition(char a, Character c) {
        if (a == ')' && c.equals('('))
            return true;
        else if (a == '}' && c.equals('{'))
            return true;
        else if (a == ']' && c.equals('['))
            return true;
        return false;
    }
}
