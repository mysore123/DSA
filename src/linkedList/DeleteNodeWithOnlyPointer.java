package linkedList;

import java.util.List;

public class DeleteNodeWithOnlyPointer {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createLinkedList();
        LinkedListOperations.printLinkedList(l1);

        ListNode l2 = l1.next.next;
        LinkedListOperations.printLinkedList(l2);

        deleteNode(l2);
        LinkedListOperations.printLinkedList(l1);
    }

    private static void deleteNode(ListNode l2) {
        ListNode temp = l2;

        l2.val = l2.next.val;
        l2.next = l2.next.next;
    }

}
