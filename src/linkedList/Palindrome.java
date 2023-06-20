package linkedList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        ListNode head = LinkedListOperations.createLinkedList();
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (stack.isEmpty()) {
            if (stack.peek() != temp.val) {
                return false;
            }
            else {
                stack.pop();
                temp = temp.next;
            }
        }

        return true;
    }

//    public static TreeNode reverse(TreeNode head) {
//        TreeNode prev = null;
//        TreeNode current = head;
//
//        while (current != null) {
//            TreeNode after = current.next;
//            current.next = prev;
//            prev = current;
//            current = after;
//        }
//
//        return prev;
//
//    }
}
