// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
// Note : You may assume the two numbers do not contain any leading zero, except the number 0 itself.

package linkedList;
public class SumOfLinkedLists {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createLinkedList();
        ListNode l2 = LinkedListOperations.createLinkedList();
        LinkedListOperations.printLinkedList(LinkedListOperations.reverse(addLinkedLists(l1,l2)));
        LinkedListOperations.printLinkedList(l1);
        LinkedListOperations.printLinkedList(l2);

    }

    private static ListNode addLinkedLists(ListNode l1, ListNode l2) {

        int sum = 0;
        int carry = 0;

        ListNode l3 = null;

        while (l1 != null || l2 != null) {

            if (l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            }
            else if (l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }

            if (sum > 9) {
                carry = 1;
            }
            else carry = 0;

            l3 = addToEndOfLinkedList(sum % 10, l3);
        }
        // This is an edge when carry is still left and l1 and l2 are both null. eg. 99 + 999
        if (carry == 1) {
            l3 = addToEndOfLinkedList(1, l3);
        }

        return l3;
    }

    private static ListNode addToEndOfLinkedList(int i, ListNode head) {
        ListNode newNode = new ListNode(i, null);

        if (head == null) {
            head = newNode;
        }
        else {
            ListNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        return head;
    }

}
