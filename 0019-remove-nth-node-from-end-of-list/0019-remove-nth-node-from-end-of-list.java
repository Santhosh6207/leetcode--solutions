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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if (head == null) {
            return null;
        }
        int c=1;
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
         if (c == n) {
            ListNode newhead = head.next;
            head = null;
            return newhead;
        }
        int val=c-n;
        temp=head;
        ;
        while(temp!=null)
        {
           val--;
           if(val==0)
           break;
           temp=temp.next;
        }
            //ListNode del=temp.next;
             temp.next=temp.next.next;
            // del=null;

      return head;
    }
}