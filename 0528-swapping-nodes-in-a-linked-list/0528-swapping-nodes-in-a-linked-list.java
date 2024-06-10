/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       
        ListNode prev1 = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode prev2 = null;
        int count = 0;

       
        while (fast != null) {
            count++;
            if (count == k) {
                break;
            }
            prev1 = fast;
            fast = fast.next;
        }

        temp1 = fast;
        
       
        while (fast.next!= null) {
            prev2 = slow;
            slow = slow.next;
            fast = fast.next;
        }
        
        temp2 = slow;

        int temp=temp2.val;
        temp2.val=temp1.val;
        temp1.val=temp;

        return head;
    }
}