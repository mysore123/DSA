package stack;

import java.util.Stack;

// LeetCode - https://leetcode.com/problems/simplify-path/
public class SimplifyPath {
    public static void main(String[] args) {
        //convert file path from absolute to canonical
        String path = "/home/";
        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        String output = "";
        Stack<String> stack = new Stack<>();
        for (String ele : pathArray) {
            if (!ele.equals("") && !ele.equals(".") && !ele.equals("..")) {
                stack.add(ele);
            }
            else {
                if (ele.equals("..") && !stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        // Using a temp string to store all elements from stack
        String temp = "";
        if (stack.isEmpty()) return "/";
        for (String i : stack) {
            temp = temp + "/" + i;
        }
        return temp;
    }
}
