package linkedList;

public class SegregateEvenAndOddNumbers {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createLinkedList();
        LinkedListOperations.printLinkedList(segregateEvenAndOdd(l1));
    }

    private static ListNode segregateEvenAndOdd(ListNode l1) {
        ListNode temp = l1;
        int pos = 1;

        while (temp.next != null) {
            ListNode after = temp.next;
            // compare temp and next value
            if (sequenceWrong(temp.val, after.val)) {
                insertInPos(l1, pos, after);
                deleteAfter(temp, after);
            }
            else {
                pos++;
                temp = temp.next;
            }
        }
        return l1;
    }

    private static void insertInPos(ListNode head, int pos, ListNode after) {
        ListNode temp = head;
        int count = 1;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        ListNode newNode = new ListNode(after.val);
        ListNode next = temp.next;
        newNode.next = next;
        temp.next = newNode;
    }

    private static void deleteAfter(ListNode temp, ListNode after) {
        temp.next = after.next;
    }

    private static boolean sequenceWrong(int a, int b) {
        if (a % 2 != 0 && b % 2 == 0) {
            return true;
        }
        return false;
    }
}
