//Given the head of a sorted linked list,
// delete all duplicates such that each element appears only once.
// Return the linked list sorted as well.
package linkedList;

import java.awt.*;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        addNodes(head);
        deleteDuplicates(head);
        printNodes(head);
    }

    private static void printNodes(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+ "->");
            temp = temp.next;
        }
    }

    public static void addNodes(ListNode head) {
        ListNode temp = head;
        for (int i = 1; i < 3; i++) {
            ListNode newNode = new ListNode(i, null);
            temp.next = newNode;
            temp = newNode;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        // check if prev element equals current if so delete it else move on
        ListNode cur = head.next;
        ListNode prev = head;

        while (cur != null) {
            boolean deleted = false;
            if (cur.val == prev.val) {
                deleted = deleteNode(cur, prev);
            }
            if (!deleted) prev = prev.next;
            cur = cur.next;
        }
        String str = "";
        char[] arr = {};
        return head;

    }

    private static boolean deleteNode(ListNode cur, ListNode prev) {
        prev.next = cur.next;
        return true;
    }
}
