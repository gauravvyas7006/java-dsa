package dsa.LinkedList;

class Node {
    int val;
    Node next;

    Node(int value) {
        this.val = value;
        this.next = null;
    }
}

public class ReorderList {

    // Function to reorder list
    public static void reorderList(Node head) {
        if (head == null || head.next == null) return;

        // STEP 1: Find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: Reverse second half
        Node second = slow.next;
        slow.next = null; // break list

        Node prev = null;
        while (second != null) {
            Node next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        // STEP 3: Merge two halves
        Node first = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            Node temp1 = first.next;
            Node temp2 = secondHalf.next;

            first.next = secondHalf;
            secondHalf.next = temp1;

            first = temp1;
            secondHalf = temp2;
        }
    }

    // Helper to print list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Create list: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original: ");
        printList(head);

        reorderList(head);

        System.out.print("Reordered: ");
        printList(head);
    }
}