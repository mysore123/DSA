// Floyds Algo Idea : Use fast and slow pointer to find meeting point
// Then move the slow pointer to beginning and let fast pointer be at meeting point.
// Then move slow and fast pointer one node at a time and where they meet will be the
// ending point of the loop.

package linkedList;
import java.util.HashSet;

public class DetectAndRemoveLoop {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createCyclicLinkedList();
        LinkedListOperations.printCyclicLinkedList(l1);
        System.out.println();
        // Using HashSet
        LinkedListOperations.printLinkedList(usingHashSet(l1));
        // Using Floyd's cycle detection
        usingFloydsAlgo(l1);
        LinkedListOperations.printLinkedList(l1);

    }

    private static ListNode usingHashSet(ListNode l1) {
        ListNode head = l1;
        ListNode temp = head;
        ListNode prev = null;

        HashSet<ListNode> set = new HashSet<>();
        while (temp != null) {
            if (set.contains(temp)) {
                prev.next = null;
                break;
            }
            set.add(temp);
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static void usingFloydsAlgo(ListNode l1) {

        ListNode slow = l1;
        ListNode fast = l1;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        // Check if it is a loop at all
        if (fast != slow ) {
            return;
        }
        // Loop Removal
        slow = l1;
        if (fast == l1) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}
