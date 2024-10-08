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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
          return head;
        ListNode temp=head;
        ArrayList<Integer>al=new ArrayList<>();
        while(temp!=null&&temp.next!=null)
        {
            al.add(temp.val);
            temp=temp.next;
        }
        if(temp!=null)
        al.add(temp.val);
        Collections.sort(al);
        temp=head;
        for(int i=0;i<al.size();i++)
        {
            temp.val=al.get(i);
            temp=temp.next;
        }
        return head;
    }
}