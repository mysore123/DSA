package linkedList;

import java.util.Arrays;

public class NextGreater {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createLinkedList();
        System.out.println(Arrays.toString(nextLargerNodes(l1)));
    }

    public static int[] nextLargerNodes(ListNode head) {
        ListNode temp = reverse(head);
        head = temp;
        int size = 1;
        while (head.next != null) {
            head = head.next;
            size++;
        }
        int[] result = new int[size];

        int greatest = temp.val;
        result[size-1] = 0;
        head = temp;

        if (head.next == null) {
            return result;
        }
        else {
            int i = size - 2;
            head = temp.next;
            while (head != null) {
                if (head.val > greatest) {
                    result[i] = 0;
                    greatest = head.val;
                }
                else result[i] = greatest;
                head = head.next;
                i--;
            }
        }

        return result;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }

        return prev;
    }
}
