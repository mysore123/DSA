//
package stack;
import java.util.*;

public class GoogleQuestion {
    public static void main(String[] args) {
        String[] input = {"TT","TT","UF","DM","DM","DM","DM","DM","DM","TT","UF","TT"};
        Queue<String> queue = findOutput(input);
        for (String ele : queue) {
            System.out.println(ele);
        }
    }

    private static Queue<String> findOutput(String[] input) {
        Queue<String> output = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("UF")) {
                output.add(input[i]);
            }
            else if (input[i].equals("TT")) {
                stack.add("TT");
                 if (i == input.length - 1 || !input[i+1].equals("TT")) {
                    if (stack.size() >= 2) {
                        output.add("TT + " + (stack.size() - 1) + " more");
                    }
                    else {
                        output.addAll(stack);
                    }
                    stack.clear();
                }
            }
            else if (input[i].equals("DM")) {
                stack.add("DM");
                 if (i == input.length - 1 || !input[i+1].equals("DM")) {
                    if (stack.size() >= 5) {
                        output.add("DM + " + (stack.size() - 1) + " more");
                    }
                    else {
                        output.addAll(stack);
                    }
                    stack.clear();
                }
            }
        }
        return output;
    }
}
