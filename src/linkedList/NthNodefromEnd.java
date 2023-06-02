// Find Nth node from end of Linked List
// Approach 1 : Find size and then traverse till size - n + 1;
// Approach 2 : Use sliding window with a size of n
// Assumption n > size of Linkedlist
package linkedList;

public class NthNodefromEnd {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createLinkedList();
        System.out.println(findNthNodeFromEnd(l1, 2)); // Using Approach 2
    }

    private static int findNthNodeFromEnd(ListNode l1, int n) {
        System.out.println("Size" + LinkedListOperations.size(l1));
        if (n > LinkedListOperations.size(l1)) return -1;
        ListNode slow = l1;
        ListNode fast = l1;

        int  i = 0;
        while (i < n) {
            fast = fast.next;
            i++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;

    }
}
