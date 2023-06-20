package linkedList;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode h1 = LinkedListOperations.createLinkedList();
        h1 = reverse(h1);
        LinkedListOperations.printLinkedList(h1);

        // Recursive
        ListNode current = h1;
        LinkedListOperations.printLinkedList(recursiveReverse(current, null));
    }

    private static ListNode reverse(ListNode h1) {
        ListNode prev = null;
        ListNode current = h1;

        while (current != null) {
            ListNode after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }
        return prev;
        //return pointer to new head
    }

    private static ListNode recursiveReverse(ListNode current, ListNode prev) {
        if (current == null) {
            return prev;
        }
        else {
            ListNode after = current.next;
            current.next = prev;
            return recursiveReverse(after, current);
        }
    }
}
