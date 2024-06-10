class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nextnode;
        ListNode prevnode = null;
        int count = 0;

       
        while (temp != null) {
            ListNode kthnode = findknode(temp, k);
            if (kthnode == null) {
                if (prevnode != null)
                    prevnode.next = temp;
                break;
            }
            nextnode = kthnode.next;
            kthnode.next = null;
            reverse(temp);

            if (head == temp) {
                head = kthnode;
            } else {
                prevnode.next = kthnode;
            }
            prevnode = temp;
            temp = nextnode;
        }
        return head;
    }

    public ListNode findknode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public void reverse(ListNode head) {
        if (head == null || head.next == null)
            return;

        reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
    }
}
