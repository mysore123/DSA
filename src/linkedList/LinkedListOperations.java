package linkedList;
import java.util.Scanner;

public class LinkedListOperations {
    public static void main(String[] args) {
    }

    public static ListNode createLinkedList() {
        System.out.println("Enter elements of Linked List");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ListNode head = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " element value: ");
            int val = sc.nextInt();

            ListNode newNode = new ListNode();
            newNode.val = val;
            newNode.next = null;
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
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode reverse(ListNode h1) {
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

    public static int size(ListNode head) {
        ListNode temp = head;
        if (temp == null) return 0;
        else if (temp.next == null) return 1;
        else {
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }
    }

}
