public class Solution {
    public static ListNode head = null;

    public static void main(String[] args) {
        // Test case 1
        System.out.println("Test case 1");
        insertNode(1);
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);
        head = rotateRight(head, 2);
        printList(head);

        // Test case 2
        System.out.println("Test case 2");
        insertNode(0);
        insertNode(1);
        insertNode(2);
        head = rotateRight(head, 4);
        printList(head);

        // Test case 3
        System.out.println("Test case 3");
        insertNode(1);
        head = rotateRight(head, 99);
        printList(head);

        // Test case 4
        System.out.println("Test case 4");
        insertNode(1);
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);
        head = rotateRight(head, 0);
        printList(head);

        // Test case 5
        System.out.println("Test case 5");
        insertNode(10);
        insertNode(20);
        insertNode(30);
        insertNode(40);
        insertNode(50);
        head = rotateRight(head, 5);
        printList(head);

        // Test case 6
        System.out.println("Test case 6");
        head = rotateRight(head, 3);

        // Test case 7
        System.out.println("Test case 7");
        insertNode(1);
        insertNode(2);
        insertNode(2);
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);
        insertNode(5);
        insertNode(6);
        head = rotateRight(head, 3);
        printList(head);

    }

    public static void insertNode(int value) {
        if (head == null) {
            head = new ListNode(value);
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(value);
        }
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }

        if (head != null && head.val == 0) {
            System.out.println("null");
        } else {
            head = null;
            System.out.println();
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head;
        k = k % length;
        k = length - k;

        while (k-- > 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}






