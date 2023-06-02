// Need to find middle element of linked list
// In case of even no of elements take the 2nd middle


// Ans : Approach 1 -> find size of linked list and then traverse till size/2
// Ans : Approach 2 -> use slow and fast pointer

package linkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode l1 = LinkedListOperations.createLinkedList();
//        System.out.println(naiveApproach(l1));
        System.out.println(betterApproach(l1));
    }

    private static int betterApproach(ListNode l1) {
        ListNode slow = l1;
        ListNode fast = l1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    private static int naiveApproach(ListNode l1) {
        ListNode temp = l1;
        ListNode temp2 = l1;
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        int i = 0;
        while (i < size/2) {
            temp2 = temp2.next;
            i++;
        }
        return temp2.val;
    }
}
