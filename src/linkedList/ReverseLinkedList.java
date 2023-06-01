package linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode h1 = LinkedListOperations.createLinkedList();
        LinkedListOperations.printLinkedList(h1);

        h1 = reverse(h1);
        LinkedListOperations.printLinkedList(h1);
    }

    private static ListNode reverse(ListNode h1) {
        ListNode prev = null;
        ListNode current = h1;
        ListNode after = h1.next;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = after;
            if (after != null) {
                after = after.next;
            }
        }
        return prev;
        //return pointer to new head
    }
}
