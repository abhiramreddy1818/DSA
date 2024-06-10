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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0)
         return null;
        ListNode head=lists[0];
        for(int i=1;i<n;i++)
        {
            head=merge2list(head,lists[i]);
        }
        return head;
    }
     public ListNode merge2list(ListNode temp1, ListNode temp2) {
      ListNode list=new ListNode(-1);
     
      ListNode temp=list;
      
      while(temp1!=null && temp2!=null){
          if(temp1.val>temp2.val){

            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
            temp.next=null;

            
          }
          else
          {
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
            temp.next=null;

          }
          
      } 
      while(temp1!=null){
        
           temp.next=temp1;
               temp=temp.next;
             temp1=temp1.next;
      }  
      while(temp2!=null){
         
             temp.next=temp2;
             temp=temp.next;
             temp2=temp2.next;
      }  
 return list.next;
    }
}