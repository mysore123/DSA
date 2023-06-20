package linkedList;

public class MergeTwoLinkedLists {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createLinkedList();
        ListNode l2 = LinkedListOperations.createLinkedList();

        LinkedListOperations.printLinkedList(mergeLists(l1, l2));

    }

    private static ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;

        ListNode head = a.val < b.val ? a : b;
        ListNode tail = head;

        if (tail == a) {
            a = a.next;
        }
        else b = b.next;

        while (a != null && b != null) {
            int[] result = new int[5];

            if (a.val < b.val) {
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else if (b.val < a.val) {
                tail.next = b;
                tail = b;
                b = b.next;
            }

        }

        tail.next = a == null ? b : a;

        return head;

    }
}
