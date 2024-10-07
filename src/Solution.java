public class Solution {
    public static ListNode head = null;

    public static void main(String[] args) {
        insertNode(0);
        insertNode(1);
        insertNode(2);
//        insertNode(4);
//        insertNode(5);

        printList(head);
        head = rotateRight(head, 4);
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
        System.out.println();
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






