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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode dummy=new ListNode(-1);
        ListNode temp1= dummy;
        ListNode temp=head;
        while(temp!=null){
            sum=sum+temp.val;
            temp=temp.next;
            if(temp!=null && temp.val==0){
                ListNode newnode=new ListNode(sum);
                temp1.next=newnode;
                temp1=temp1.next;
                 sum=0;
            }

             
        }
        return dummy.next;
    }
}