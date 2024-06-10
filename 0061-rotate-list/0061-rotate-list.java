public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int count = 1;

        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        k = k % count;

        if (k == 0) {
            return head;
        }

        temp.next = head;
        temp = head;

        for (int i = 0; i < count - k - 1; i++) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}
